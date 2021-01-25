package com.ordestiny.tdd.service;

import org.springframework.stereotype.Service;

@Service
public class EchoService {
    public String echo(String message) {
        return message;
    }

    public String echoHello(String message) {
        return "Hello " + message;
    }
}
