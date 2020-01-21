package cn.blogs.taobao01.utils;

import cn.blogs.taobao01.entity.Material;
import cn.blogs.taobao01.entity.MaterialCoupon;
import cn.blogs.taobao01.entity.MaterialMkt;
import cn.blogs.taobao01.entity.MaterialSeller;
import cn.blogs.taobao01.service.tk.MaterialService;
import com.alibaba.fastjson.JSONObject;

/**
 * @author lyzhang
 * @since 2020/1/19 16:40
 */
public class jsonToObject {
  public static Material toMaterial(JSONObject context) {
    Material material = new Material();
    material.setMatCoupon(toMaterialCoupon(context));
    material.setMatSeller(toMaterialSeller(context));
    material.setMatMkt(toMaterialMkt(context));
    material.setxId((String)context.get("x_id"));
    material.setItemId((Long) context.get("item_id"));
    material.setTitle((String)context.get("title"));
    material.setItemUrl((String)context.get("item_url"));
    material.setItemDescription((String)context.get("item_description"));
    material.setProvcity((String)context.get("provcity"));
    material.setPictUrl((String) context.get("pict_url"));
    material.setSmallImages(context.containsKey("small_images")?(String)context.get("small_images").toString():JSONObject.parseObject("{}").toString());
    material.setWhiteImage((String)context.get("white_image"));
    material.setRealPostFee((String)context.get("real_post_fee"));
    material.setReservePrice((String)context.get("reserve_price"));
    material.setZkFinalPrice((String)context.get("zk_final_price"));
    material.setVolume((Integer) context.get("volume"));
    material.setCategoryId((Integer)context.get("category_id"));
    material.setCategoryName((String)context.get("category_name"));
    material.setLevelOneCategoryId((Integer) context.get("level_one_category_id"));
    material.setLevelOneCategoryName((String)context.get("level_one_category_name"));
    return material;
  }

  public static MaterialCoupon toMaterialCoupon(JSONObject context){
    MaterialCoupon materialCoupon = new MaterialCoupon();
    materialCoupon.setUrl((String)context.get("pict_url"));
    materialCoupon.setTkTotalSales((String) context.get("tk_total_sales"));
    materialCoupon.setTkTotalCommi((String)context.get("tk_total_commi"));
    materialCoupon.setCouponId((String)context.get("coupon_id"));
    materialCoupon.setCouponInfo((String)context.get("coupon_info"));
    materialCoupon.setCouponShareUrl((String)context.get("coupon_share_url"));
    materialCoupon.setCouponTotalCount((Integer) context.get("coupon_total_count"));
    materialCoupon.setCouponRemainCount((Integer) context.get("coupon_remain_count"));
    materialCoupon.setCouponStartFee((String)context.get("coupon_start_fee"));
    materialCoupon.setCouponAmount((String)context.get("coupon_amount"));
    materialCoupon.setCouponStartTime((String)context.get("coupon_start_time"));
    materialCoupon.setCouponEndTime((String)context.get("coupon_end_time"));
    materialCoupon.setCommissionRate((String)context.get("commission_rate"));
    materialCoupon.setCommissionType((String)context.get("commission_type"));
    return materialCoupon;
  }
  public static MaterialMkt toMaterialMkt(JSONObject context){
    MaterialMkt materialMkt = new MaterialMkt();
    materialMkt.setItemId((Long) context.get("item_id"));
    materialMkt.setIncludeDxjh((String)context.get("include_dxjh"));
    materialMkt.setInfoDxjh((String)context.get("info_dxjh"));
    materialMkt.setIncludeMkt((String)context.get("include_mkt"));
    materialMkt.setPresaleDeposit((String)context.get("presale_deposit"));
    materialMkt.setPresaleEndTime((Integer) (context.get("presale_end_time") instanceof Long ?((Long) context.get("presale_end_time")).intValue():context.get("presale_end_time")));
    materialMkt.setPresaleStartTime((Integer) (context.get("presale_start_time")instanceof Long ?((Long) context.get("presale_start_time")).intValue():context.get("presale_start_time")));
    materialMkt.setPresaleTailEndTime((Integer) (context.get("presale_tail_end_time") instanceof Long ?((Long) context.get("presale_tail_end_time")).intValue():context.get("presale_tail_end_time")));
    materialMkt.setPresaleTailStartTime((Integer) (context.get("presale_tail_start_time") instanceof  Long ?((Long) context.get("presale_tail_start_time")).intValue():context.get("presale_tail_start_time")));
    return materialMkt;
  }
  public static MaterialSeller toMaterialSeller(JSONObject context){
    MaterialSeller materialSeller = new MaterialSeller();
    materialSeller.setNick((String)context.get("nick"));
    materialSeller.setUserType((Integer)context.get("user_type"));
    materialSeller.setSellerId(context.getString("seller_id"));
    materialSeller.setShopDsr((Integer)context.get("shop_dsr"));
    materialSeller.setShopTitle((String)context.get("shop_title"));
    return materialSeller;
  }
}
