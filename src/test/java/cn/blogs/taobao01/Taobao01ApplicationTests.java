package cn.blogs.taobao01;

import cn.blogs.taobao01.dao.CategoryMapper;
import cn.blogs.taobao01.dao.GuessLikeMapper;
import cn.blogs.taobao01.dao.KeywordMapper;
import cn.blogs.taobao01.dao.MaterialCouponMapper;
import cn.blogs.taobao01.dao.MaterialMapper;
import cn.blogs.taobao01.dao.MaterialMktMapper;
import cn.blogs.taobao01.dao.MaterialSellerMapper;
import cn.blogs.taobao01.entity.Category;
import cn.blogs.taobao01.entity.GuessLike;
import cn.blogs.taobao01.entity.Keyword;
import cn.blogs.taobao01.entity.Material;
import cn.blogs.taobao01.entity.MaterialCoupon;
import cn.blogs.taobao01.entity.MaterialMkt;
import cn.blogs.taobao01.entity.MaterialSeller;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan("classpath:mappers/*.xml")
class Taobao01ApplicationTests {

  @Autowired
  private CategoryMapper categoryMapper;

  @Autowired
  private GuessLikeMapper guessLikeMapper;

  @Autowired
  private KeywordMapper keywordMapper;

  @Autowired
  private MaterialMapper materialMapper;

  @Autowired
  private MaterialSellerMapper materialSellerMapper;

  @Autowired
  private MaterialCouponMapper materialCouponMapper;

  @Autowired
  private MaterialMktMapper materialMktMapper;
  @Test
  void contextLoads() {}

  @Test
  public void test01() throws IOException {
    Material material = materialMapper.getMaterialById(1);
    System.out.println(material);
  }
}
