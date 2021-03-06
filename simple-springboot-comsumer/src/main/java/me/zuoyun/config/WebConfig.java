package me.zuoyun.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZuoYun on 9/5/16.
 * Time: 9:37 PM
 * Information:
 */

@Configuration
@ComponentScan(basePackages = "me.zuoyun.controller")
public class WebConfig {

  final static Logger logger = LoggerFactory.getLogger(WebConfig.class);
}
