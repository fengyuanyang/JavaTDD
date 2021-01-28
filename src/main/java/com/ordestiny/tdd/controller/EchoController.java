package com.ordestiny.tdd.controller;

import com.ordestiny.tdd.service.EchoService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class EchoController {
    private EchoService echoService;

    @GetMapping("/echo/{message}")
    ResponseEntity<String> echo(@PathVariable String message) {
        String response = echoService.echo(message);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/echo")
    ResponseEntity<String> echoWithObject(@RequestBody EchoObject echoObject) {
        String response = echoService.echo(echoObject.getMessage());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Getter @Setter
    @NoArgsConstructor
    public static class EchoObject {
        private String message;
    }
}
