package cn.blogs.taobao01.dao;

import cn.blogs.taobao01.entity.MaterialBeat;

/**
 * @author lyzhang
 * @since 2020/1/22 15:22
 */
public interface MaterialBeatMapper {
  public MaterialBeat getMatBeatById(Integer id);
  public MaterialBeat getMatBeatByItemId(Long itemId);
  public void addMatBeat(MaterialBeat materialBeat);
}
