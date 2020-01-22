package cn.blogs.taobao01.service.tk;

import cn.blogs.taobao01.dao.MaterialCouponMapper;
import cn.blogs.taobao01.dao.MaterialMapper;
import cn.blogs.taobao01.dao.MaterialMktMapper;
import cn.blogs.taobao01.dao.MaterialSellerMapper;
import cn.blogs.taobao01.entity.Material;
import cn.blogs.taobao01.entity.MaterialCoupon;
import cn.blogs.taobao01.entity.MaterialMkt;
import cn.blogs.taobao01.entity.MaterialSeller;
import cn.blogs.taobao01.utils.jsonToObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * @author lyzhang
 * @since 2020/1/19 16:14
 */
@Service
@PropertySource(value = {"classpath:config.properties"})
public class MaterialService extends tbCommon{

  @Autowired
  private MaterialMapper materialMapper;

  @Autowired
  private MaterialCouponMapper materialCouponMapper;

  @Autowired
  private MaterialSellerMapper materialSellerMapper;

  @Autowired
  private MaterialMktMapper materialMktMapper;

  public void test() {
    searchAndInsertIndex("");
  }

  public boolean searchAndInsertIndex(String keyword){
    for(int i =1;i<40;i++) {
      if(!searchAndInsert(keyword,Long.valueOf(i))) {
        break;
      }
    }
    return true;
  }

  /**
   * 物料搜索，并写入到数据库
   * @param keyword 关键词
   * @param pageNo 页码
   * @return
   */
  private boolean searchAndInsert(String keyword,Long pageNo) {
    Material material;
    MaterialSeller materialSeller;
    MaterialCoupon materialCoupon;
    MaterialMkt materialMkt;
    Material materialNew;
    TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
    TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
    req.setQ(keyword);
    req.setIncludePayRate30(true);//设置成交转化率高于行业平均值
    req.setIncludeGoodRate(true); //设置好评率高于行业平均值
    //req.setIncludeRfdRate(true); //设置退款率低于行业平均值
    //req.setNpxLevel(2L); //设置商品没有牛皮癣
    req.setNeedFreeShipment(true);//设置商品包邮
    req.setIsTmall(true); //设置为天猫的商品
    req.setNeedPrepay(true);//设置商家加入消费者保障
    req.setSort("total_sales");
    req.setHasCoupon(true); //设置物料有优惠券
    req.setPageSize(50L);  //每页多少个
    req.setPageNo(pageNo); //设置页面
    req.setAdzoneId(adzoneid);
    try {
      TbkDgMaterialOptionalResponse rsp = client.execute(req);
      JSONObject jsonObject = JSONObject.parseObject(rsp.getBody());
      JSONObject result_list = jsonObject.getJSONObject("tbk_dg_material_optional_response");
      if (result_list == null) {
        return false;
      }
      JSONObject map_data = result_list.getJSONObject("result_list");
      JSONArray infos = map_data.getJSONArray("map_data");
      for(int i = 0 ;i < infos.size(); i++) {
        material = jsonToObject.toMaterial((infos.getJSONObject(i)));
        materialSeller = materialSellerMapper.getMatSellerBySellerId(material.getMatSeller().getSellerId());
        if (materialSeller == null) {
          materialSellerMapper.addMatSeller(material.getMatSeller());
        }else {
          material.setMatSeller(materialSeller);
        }
        //System.out.println(material.getMatSeller());

        materialCoupon = materialCouponMapper.getMatCouponByCouponId(material.getMatCoupon().getCouponId());
        if (materialCoupon == null) {
          materialCouponMapper.addMatCoupon(material.getMatCoupon());
        }else {
          material.setMatCoupon(materialCoupon);
        }
        //System.out.println(material.getMatCoupon());

        materialMkt = materialMktMapper.getMatMktByItemId(material.getMatMkt().getItemId());
        if(materialMkt == null) {
          materialMktMapper.addMatMkt(material.getMatMkt());
        }else{
          material.setMatMkt(materialMkt);
        }
        //System.out.println(material.getMatMkt());

        materialNew = materialMapper.getMaterialByItemId(material.getItemId());
        if(materialNew == null){
          materialMapper.addMaterial(material);
        }

      }
    } catch (ApiException e) {
      e.printStackTrace();
    }
    return true;
  }
}
