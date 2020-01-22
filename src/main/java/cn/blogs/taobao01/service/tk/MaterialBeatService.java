package cn.blogs.taobao01.service.tk;

import cn.blogs.taobao01.dao.MaterialBeatMapper;
import cn.blogs.taobao01.entity.MaterialBeat;
import cn.blogs.taobao01.utils.jsonToObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgOptimusMaterialRequest;
import com.taobao.api.response.TbkDgOptimusMaterialResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lyzhang
 * @since 2020/1/22 11:42
 */
@Service
public class MaterialBeatService extends tbCommon{
  @Autowired
  private MaterialBeatMapper materialBeatMapper;

  public void searchAndInsertIndex(Long materialId){
    for(int i=1;i<40;i++){
      if(!searchAndInsert(materialId,Long.valueOf(i))){
        break;
      }
    }
  }

  private boolean searchAndInsert(Long materialId,Long pageNo){
    MaterialBeat materialBeat;
    MaterialBeat materialBeat1;
    TaobaoClient client = new DefaultTaobaoClient(url,appkey,secret);
    TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
    req.setAdzoneId(adzoneid);
    req.setPageSize(50L);
    req.setPageNo(pageNo);
    req.setMaterialId(materialId); //物料ID
    try {
      TbkDgOptimusMaterialResponse rsp = client.execute(req);
      JSONObject jsonObject = JSONObject.parseObject(rsp.getBody());
      JSONObject resultList = jsonObject.getJSONObject("tbk_dg_optimus_material_response");
      if (resultList == null) {
        return false;
      }
      JSONObject mapData = resultList.getJSONObject("result_list");
      JSONArray infos = mapData.getJSONArray("map_data");
      for(int i =0; i< infos.size();i++){
        materialBeat = jsonToObject.toMaterialBeat(infos.getJSONObject(i));
        materialBeat.setMaterialId(materialId.intValue());
        materialBeat1 = materialBeatMapper.getMatBeatByItemId(materialBeat.getItemId());
        if(materialBeat1 == null) {
          materialBeatMapper.addMatBeat(materialBeat);
        }
      }
   //   System.out.println(rsp.getBody());
    } catch (ApiException e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
}
