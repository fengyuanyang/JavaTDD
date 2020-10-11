package com.ordestiny.tdd.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* author fengyuan yang coolsealtw@hotmail.com
 */
class HelloWorldTest {
    private HelloWorld helloWorld = new HelloWorld();

    @Test
    void hello_NoInput_HelloWorldJava() {
        String result = helloWorld.hello();
        assertEquals("Hello World Java", result);
    }

    @Test
    void hello_InputName_HelloWorldWithName() {
        String result = helloWorld.hello("Name");
        assertEquals("Hello World Name", result);
    }

    @Test
    void helloStringFormat_InputName_HelloWorldWithName() {
        String result = helloWorld.helloStringFormat("Name");
        assertEquals("Hello World Name", result);
    }
}