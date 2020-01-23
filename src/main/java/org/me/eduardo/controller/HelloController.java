package org.me.eduardo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  @RequestMapping("/hello")
  public String index() {
    return "Hello Maven Plugins world!";
  }
}
