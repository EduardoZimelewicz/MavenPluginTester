package org.me.eduardo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eduardo Zimelewicz
 * @version 1.0.0 Controller class for REST method mapping.
 */
@RestController
@RequestMapping("/api")
public final class HelloController {

  private HelloController() {}

  /**
   * GET class /api/hello.
   *
   * @return String
   */
  @GetMapping("/hello")
  public static String index() {
    return "Hello Maven Plugins world!";
  }
}
