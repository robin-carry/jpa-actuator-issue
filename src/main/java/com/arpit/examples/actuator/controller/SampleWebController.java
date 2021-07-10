package com.arpit.examples.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class SampleWebController {

  @GetMapping("/ping")
  public String ping() {
    return "Hello World";
  }
}
