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
public class MaterialService {
  @Value("${taobao.appkey}")
  private String appkey;
  @Value("${taobao.secret}")
  private String secret;
  @Value("${taobao.url}")
  private String url;
  @Value("${taobao.AdzoneID}")
  private Long adzoneid;

  @Autowired
  private MaterialMapper materialMapper;

  @Autowired
  private MaterialCouponMapper materialCouponMapper;

  @Autowired
  private MaterialSellerMapper materialSellerMapper;

  @Autowired
  private MaterialMktMapper materialMktMapper;

  @Test
  public void test() {
    System.out.println(materialMapper.getMaterialById(22));
   search("女装");
  }

  public boolean search(String keyword) {
    TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
    TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
    req.setQ(keyword);
  //  req.setPageNo(1);
    req.setIncludePayRate30(true);
    //   req.setIncludeGoodRate(true);
    //   req.setIncludeRfdRate(true);
    req.setIsTmall(true);
    req.setSort("total_sales");
    req.setIsTmall(true);
    req.setHasCoupon(true);
    req.setPageSize(100L);
    req.setAdzoneId(adzoneid);
 //   LinkedList<Material> materials =  new LinkedList<>();
    try {
      TbkDgMaterialOptionalResponse rsp = client.execute(req);
      JSONObject jsonObject = JSONObject.parseObject(rsp.getBody());
      JSONObject result_list = jsonObject.getJSONObject("tbk_dg_material_optional_response");
      if (result_list == null) {
  //      logger.info("search# 关键词:{},页面:{} result is null",keyword,pagenum);
        return false;
      }
      JSONObject map_data = result_list.getJSONObject("result_list");
      JSONArray infos = map_data.getJSONArray("map_data");
     System.out.println(infos.toString());
      for(int i = 0 ;i < infos.size(); i++) {
        Material material = jsonToObject.toMaterial((infos.getJSONObject(i)));
        MaterialSeller materialSeller = materialSellerMapper.getMatSellerBySellerId(material.getMatSeller().getSellerId());
        if (materialSeller == null) {
          materialSellerMapper.addMatSeller(material.getMatSeller());
        }else {
          material.setMatSeller(materialSeller);
        }
        System.out.println(material.getMatSeller());

        MaterialCoupon materialCoupon = materialCouponMapper.getMatCouponByCouponId(material.getMatCoupon().getCouponId());
        if (materialCoupon == null) {
          materialCouponMapper.addMatCoupon(material.getMatCoupon());
        }else {
          material.setMatCoupon(materialCoupon);
        }
        System.out.println(material.getMatCoupon());

        MaterialMkt materialMkt = materialMktMapper.getMatMktByItemId(material.getMatMkt().getItemId());
        if(materialMkt == null) {
          materialMktMapper.addMatMkt(material.getMatMkt());
        }else{
          material.setMatMkt(materialMkt);
        }
        System.out.println(material.getMatMkt());

        Material materialNew = materialMapper.getMaterialByItemId(material.getItemId());
        if(materialNew == null){
          materialMapper.addMaterial(material);
        }

      }
   //   logger.info("search# 关键词:{},页面:{} result size is {};",keyword,pagenum,infos.size());

    } catch (ApiException e) {
      e.printStackTrace();
    }
//    materialDao.insertMegs(materials);
    return true;
  }
}
