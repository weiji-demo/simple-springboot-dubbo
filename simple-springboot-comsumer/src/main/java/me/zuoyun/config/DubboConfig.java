package me.zuoyun.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by ZuoYun on 9/5/16.
 * Time: 9:22 PM
 * Information:
 */

@Configuration
@ImportResource("classpath:spring/spring-*.xml")
public class DubboConfig {

  final static Logger logger = LoggerFactory.getLogger(DubboConfig.class);
}
