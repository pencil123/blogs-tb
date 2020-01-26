package cn.blogs.taobao01.dao;

import cn.blogs.taobao01.entity.CouponCategory;
import java.util.List;

/**
 * @author lyzhang
 * @since 2020/1/22 22:55
 */
public interface CouponCategoryMapper {
  public CouponCategory getCouponCatById(Integer id);
  public CouponCategory getCouponCatByMatId(Integer materialId);
  public List<CouponCategory> getCouponCatAll();
}
