package org.airtribe.LearnerManagementSystem.controller;

import java.util.ArrayList;
import java.util.List;
import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.airtribe.LearnerManagementSystem.service.LearnerManagementService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class LearnerControllerTest {

  @Mock
  private LearnerManagementService _learnerManagementService;


  @Autowired
  private MockMvc _mockMvc;

  private List<Learner> _learnersList = new ArrayList<>();

  @InjectMocks
  private LearnerController _learnerController;

  @BeforeEach
  public void setup() {
    _learnersList.add(new Learner(1L,"test", "test@gmail.com", "test"));
    _mockMvc = MockMvcBuilders.standaloneSetup(_learnerController).build();
  }

  @Test
  public void testFetchAllLearners() throws Exception {
    when(_learnerManagementService.fetchAllLearners()).thenReturn(_learnersList);
    _mockMvc.perform(MockMvcRequestBuilders.get("/learners"))
        .andExpect(status().is2xxSuccessful())
        .andDo(print())
        .andExpect(jsonPath("$[0].learnerName").value("test"))
        .andExpect(jsonPath("$[0].learnerEmail").value("test@gmail.com"));
  }
}
