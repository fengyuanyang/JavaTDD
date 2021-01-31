package com.ordestiny.tdd.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ordestiny.tdd.model.User;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @InjectMocks
    UserController controller;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void addUser_illegalInput_expect4xx() throws Exception {
        User user = new User();
        user.setEmail("testgmail.com");
        user.setPhone("DDDD");
        user.setSex("Boy");

        ObjectMapper mapper = new ObjectMapper();
        String userObject = mapper.writeValueAsString(user);

        mockMvc.perform(MockMvcRequestBuilders.post("/user").contentType(MediaType.APPLICATION_JSON).content(userObject))
                .andExpect(status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Is.is("name is mandatory")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.phone", Is.is("must match \"(^$|[0-9]{10})\"")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", Is.is("must match \"^[A-Za-z0-9+_.-]+@(.+)$\"")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.sex", Is.is("must match \"M|F\"")))
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void addUser_legalInput_expect200AndSuccess() throws Exception {
        User user = new User();
        user.setEmail("test@gmail.com");
        user.setPhone("0911111111");
        user.setSex("F");
        user.setName("owen");

        ObjectMapper mapper = new ObjectMapper();
        String userObject = mapper.writeValueAsString(user);

        mockMvc.perform(MockMvcRequestBuilders.post("/user").contentType(MediaType.APPLICATION_JSON).content(userObject))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Is.is(user.getName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.phone", Is.is(user.getPhone())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", Is.is(user.getEmail())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.sex", Is.is(user.getSex())))
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON));
    }
}