package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.repository.JPARepository;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.Matchers.is;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class RestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private JPARepository repo;

  @Test
  public void doubling() throws Exception {
    mockMvc.perform(get("/doubling?input=5"))
        .andExpect(status().isOk())
    .andExpect(jsonPath("$.result", is(10)));
  }

  @Test
  public void greeter() throws Exception {
    mockMvc.perform(get("/greeter"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));
  }

  @Test
  public void appenda() {
  }

  @Test
  public void doUntil() {
  }

  @Test
  public void arrays() {
  }

  @Test
  public void logger() {
  }
}
