package com.ordestiny.tdd.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchoServiceTest {
    EchoService service = new EchoService();

    @Test
    void echo() {
        String message = "John";

        String response = service.echo(message);

        assertEquals(message, response);
    }

    @Test
    void echoHello() {
        String message = "Tom";

        String response = service.echoHello(message);

        assertEquals("Hello " + message, response);
    }
}