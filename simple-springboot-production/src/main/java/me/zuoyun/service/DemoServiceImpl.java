package me.zuoyun.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.zuoyun.api.DemoService;

/**
 * Created by ZuoYun on 9/5/16.
 * Time: 8:25 PM
 * Information:
 */

public class DemoServiceImpl implements DemoService {

  final static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

  public String ping() {
    logger.info("调度成功");
    return "pong";
  }
}
