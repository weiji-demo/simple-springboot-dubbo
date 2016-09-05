package me.zuoyun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.zuoyun.api.DemoService;

/**
 * Created by ZuoYun on 9/5/16.
 * Time: 9:38 PM
 * Information:
 */
@RestController
public class DemoController {

  final static Logger logger = LoggerFactory.getLogger(DemoController.class);

  @Autowired
  private DemoService demoService;

  @RequestMapping("demo")
  public String demo() {
    return demoService.ping();
  }
}
