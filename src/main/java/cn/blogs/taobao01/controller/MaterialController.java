package cn.blogs.taobao01.controller;

import cn.blogs.taobao01.service.tk.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyzhang
 * @since 2020/1/19 16:18
 */
@RestController
@RequestMapping("/mat")
public class MaterialController {
  @Autowired
  private MaterialService materialService;

  @RequestMapping("/test")
  public String test(){
    materialService.test();
    return "Run sucess";
  }


}
