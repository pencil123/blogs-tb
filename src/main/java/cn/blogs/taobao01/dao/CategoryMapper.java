package cn.blogs.taobao01.dao;

import cn.blogs.taobao01.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lyzhang
 * @since 2020/1/19 11:17
 */
public interface CategoryMapper {
  public Category getCatById (Integer id);
}
