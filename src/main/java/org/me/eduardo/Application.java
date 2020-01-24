package org.me.eduardo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Eduardo Zimelewicz
 * @version 1.0.0 Main class for spring boot bootstrap, its entry point.
 */
@SpringBootApplication
public class Application {

  /**
   * Main method for running spring boot application.
   *
   * @param args command-line arguments
   */
  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
