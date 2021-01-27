package com.ordestiny.tdd.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ordestiny.tdd.service.EchoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class EchoControllerTest {

    @Mock
    EchoService service;

    @InjectMocks
    EchoController controller;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        given(service.echo("John")).willReturn("John");
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void echo() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/echo/John"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("John"));
    }

    @Test
    void echoWithObject() throws Exception {
        EchoController.EchoObject echoObject = new EchoController.EchoObject();
        echoObject.setMessage("John");
        ObjectMapper mapper = new ObjectMapper();
        String echoJsonObject = mapper.writeValueAsString(echoObject);
        mockMvc.perform(MockMvcRequestBuilders.post("/echo").contentType(MediaType.APPLICATION_JSON).content(echoJsonObject))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("John"));
    }
}