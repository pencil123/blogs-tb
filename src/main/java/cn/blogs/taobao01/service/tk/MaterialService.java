package cn.blogs.taobao01.service.tk;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

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

  @Test
  public void test() {
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
   //   logger.info("search# 关键词:{},页面:{} result size is {};",keyword,pagenum,infos.size());

    } catch (ApiException e) {
      e.printStackTrace();
    }
//    materialDao.insertMegs(materials);
    return true;
  }
}
