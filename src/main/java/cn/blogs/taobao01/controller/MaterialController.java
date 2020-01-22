package cn.blogs.taobao01.controller;

import cn.blogs.taobao01.service.tk.MaterialBeatService;
import cn.blogs.taobao01.service.tk.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  @Autowired
  private MaterialBeatService materialBeatService;

  @RequestMapping("/test/materialsearch")
  public String materialSearch(@RequestParam(value = "keyword",required = false,defaultValue = "女装") String keyword){
    materialService.searchAndInsertIndex(keyword);
    return "Run sucess";
  }

  @RequestMapping("/test/materialbeatsearch")
  public String materialBeatSearch(@RequestParam(value = "materialid",required = false) Long materialid){
    materialBeatService.searchAndInsertIndex(materialid);
    return "Run sucess";
  }


}
