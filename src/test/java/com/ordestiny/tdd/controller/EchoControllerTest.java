package com.ordestiny.tdd.controller;

import com.ordestiny.tdd.service.EchoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

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
        BDDMockito.given(service.echo("John")).willReturn("John");
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void echo() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/echo/John"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("John"));
    }
}