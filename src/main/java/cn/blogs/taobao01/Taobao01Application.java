package cn.blogs.taobao01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.blogs.taobao01.dao")
public class Taobao01Application {

  public static void main(String[] args) {
    SpringApplication.run(Taobao01Application.class, args);
  }
}
