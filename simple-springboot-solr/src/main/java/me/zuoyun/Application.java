package me.zuoyun;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.SolrPingResponse;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by ZuoYun on 9/6/16.
 * Time: 8:47 PM
 * Information:
 *
 * solr 使用
 */
@SpringBootApplication
@RestController
public class Application {

  final static Logger logger = LoggerFactory.getLogger(Application.class);

  @Autowired
  SolrServer solrServer;

  @RequestMapping("/demo")
  public Object demo() throws IOException, SolrServerException {

    SolrPingResponse respons = solrServer.ping();

    SolrInputDocument inputFields = new SolrInputDocument();
    inputFields.setField("id","xxxxx");
    inputFields.setField("name", "zuoyun");
    solrServer.add(inputFields);
    solrServer.commit();

    return respons.getStatus();
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }
}
