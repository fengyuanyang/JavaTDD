package com.ordestiny.tdd.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* author fengyuan yang coolsealtw@hotmail.com
 */
class HelloWorldTest {
  private HelloWorld helloWorld = new HelloWorld();

  @Test
  void hello_NoInput_HelloWorldJava() {
    String result = helloWorld.hello();
    Assertions.assertEquals("Hello World Java", result);
  }

  @Test
  void hello_InputName_HelloWorldWithName() {
    String result = helloWorld.hello("Name");
    Assertions.assertEquals("Hello World Name", result);
  }

  @Test
  void helloStringFormat_InputName_HelloWorldWithName() {
    String result = helloWorld.helloStringFormat("Name");
    Assertions.assertEquals("Hello World Name", result);
  }
}
