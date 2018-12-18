package com.leon.app.webfluxsample;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebfluxSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebfluxSampleApplication.class, args);
  }

  @Bean
  public WebServerFactoryCustomizer<TomcatReactiveWebServerFactory> getMyCustomizer() {
    return factory -> factory.addContextCustomizers((context) -> {

      Tomcat.addServlet(context, "TestServlet", new TestServlet()).setAsyncSupported(true);
      context.addServletMappingDecoded("/test/*", "TestServlet");

    });
  }

}
