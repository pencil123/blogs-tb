package cn.blogs.taobao01.dao;

import cn.blogs.taobao01.entity.Material;

/**
 * @author lyzhang
 * @since 2020/1/19 14:49
 */
public interface MaterialMapper {
  public Material getMaterialById(Integer id);
  public Material getMaterialByItemId(Long itemId);
  public void addMaterial(Material material);
}
