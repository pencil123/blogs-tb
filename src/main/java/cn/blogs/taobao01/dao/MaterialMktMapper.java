package cn.blogs.taobao01.dao;

import cn.blogs.taobao01.entity.MaterialMkt;

/**
 * @author lyzhang
 * @since 2020/1/19 15:36
 */
public interface MaterialMktMapper {
  public MaterialMkt getMatMktById ( Integer id);
  public MaterialMkt getMatMktByItemId(Long itemId);
  public void addMatMkt(MaterialMkt materialMkt);
}
