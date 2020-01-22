package cn.blogs.taobao01.service.tk;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author lyzhang
 * @since 2020/1/22 13:30
 */
public class tbCommon {
  @Value("${taobao.appkey}")
  protected String appkey;
  @Value("${taobao.secret}")
  protected String secret;
  @Value("${taobao.url}")
  protected String url;
  @Value("${taobao.AdzoneID}")
  protected Long adzoneid;
}
