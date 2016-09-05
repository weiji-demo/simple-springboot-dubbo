package me.zuoyun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * Created by ZuoYun on 9/5/16.
 * Time: 8:34 PM
 * Information:
 */
@SpringBootApplication
public class Application implements EmbeddedServletContainerCustomizer {

  final static Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) throws InterruptedException {
    SpringApplication application = new SpringApplication(Application.class);
    application.run(args);
  }

  @Override
  public void customize(ConfigurableEmbeddedServletContainer container) {
    container.setPort(8081);
  }
}
