package cn.blogs.taobao01;

import cn.blogs.taobao01.dao.CategoryMapper;
import cn.blogs.taobao01.dao.CouponCategoryMapper;
import cn.blogs.taobao01.dao.GuessLikeMapper;
import cn.blogs.taobao01.dao.KeywordMapper;
import cn.blogs.taobao01.dao.MaterialCouponMapper;
import cn.blogs.taobao01.dao.MaterialMapper;
import cn.blogs.taobao01.dao.MaterialMktMapper;
import cn.blogs.taobao01.dao.MaterialSellerMapper;
import cn.blogs.taobao01.entity.Category;
import cn.blogs.taobao01.entity.CouponCategory;
import cn.blogs.taobao01.entity.GuessLike;
import cn.blogs.taobao01.entity.Keyword;
import cn.blogs.taobao01.entity.Material;
import cn.blogs.taobao01.entity.MaterialCoupon;
import cn.blogs.taobao01.entity.MaterialMkt;
import cn.blogs.taobao01.entity.MaterialSeller;
import cn.blogs.taobao01.service.tk.MaterialBeatService;
import java.io.IOException;
import java.util.List;
import java.util.zip.CheckedOutputStream;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan("cn.blogs.taobao01.dao")
class Taobao01ApplicationTests {

  @Autowired
  private CouponCategoryMapper couponCategoryMapper;
  @Autowired
  private MaterialBeatService materialBeatService;
  @Test
  void contextLoads() {}

  @Test
  public void test01() throws IOException {
    List<CouponCategory> couponCategorys = couponCategoryMapper.getCouponCatAll();
    for(CouponCategory coupon : couponCategorys) {
      System.out.println(coupon);
      materialBeatService.searchAndInsertIndex(Long.valueOf(coupon.getMaterialId()));
    }
  }
}
