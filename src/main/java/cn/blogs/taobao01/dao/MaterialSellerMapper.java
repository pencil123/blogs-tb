package cn.blogs.taobao01.dao;

import cn.blogs.taobao01.entity.MaterialSeller;

/**
 * @author lyzhang
 * @since 2020/1/19 15:02
 */
public interface MaterialSellerMapper {
  public MaterialSeller getMatSellerById (Integer id);
  public MaterialSeller getMatSellerBySellerId(String sellerId);
  public void addMatSeller(MaterialSeller materialSeller);

}
