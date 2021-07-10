package com.arpit.examples.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SampleApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(SpringBootApplication.class);
    app.run(args);
  }
}
