package com.ordestiny.tdd;

import com.ordestiny.tdd.string.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* author fengyuan yang coolsealtw@hotmail.com
 */
class HelloWorldTest {
    private HelloWorld helloWorld = new HelloWorld();

    @Test
    void test_hello_expect_hello_world_java() {
        String result = helloWorld.hello();
        assertEquals("Hello World Java", result);
    }
}