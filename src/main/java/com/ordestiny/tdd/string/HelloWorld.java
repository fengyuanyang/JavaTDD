package com.ordestiny.tdd.string;

public class HelloWorld {
  /** @return */
  String hello() {
    return "Hello World Java";
  }

  /**
   * @param name
   * @return
   */
  String hello(String name) {
    return "Hello World " + name;
  }

  /**
   * Hello world with String.format %s is using for String format
   *
   * @param name
   * @return
   */
  String helloStringFormat(String name) {
    return String.format("Hello World %s", name);
  }
}
