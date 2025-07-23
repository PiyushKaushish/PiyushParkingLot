package org.airtribe.LearnerManagementSystem;

import jakarta.transaction.Transactional;
import org.airtribe.LearnerManagementSystem.repository.LearnerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class LearnerManagementSystemIntegrationTest {

  @Autowired
  private MockMvc _mockMvc;

  @Autowired
  private LearnerRepository _learnerRepository;

  @AfterEach
  public void cleanup() {
    _learnerRepository.deleteAll();
  }

  @Test
  public void testCreateLearner() throws Exception {
    _mockMvc.perform(MockMvcRequestBuilders.post("/learners").contentType("application/json")
        .content("{\"learnerName\":\"test2\",\"learnerEmail\": \"test@gmail.com\", \"learnerPhoneNumber\":\"123\"}"))
        .andExpect(status().is2xxSuccessful())
        .andDo(print());
  }

}
