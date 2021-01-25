package com.ordestiny.tdd.controller;

import com.ordestiny.tdd.service.EchoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EchoController {
    private EchoService echoService;

    @GetMapping("/echo/{message}")
    ResponseEntity<String> echo(@PathVariable String message) {
        String response = echoService.echo(message);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
