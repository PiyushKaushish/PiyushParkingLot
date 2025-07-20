package org.airtribe.LearnerManagementSystem.service;

import java.util.Optional;
import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.airtribe.LearnerManagementSystem.exception.LearnerNotFoundException;
import org.airtribe.LearnerManagementSystem.repository.LearnerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
//@SpringBootTest
public class LearnerManagementServiceTest {

  @InjectMocks
  private LearnerManagementService learnerManagementService;

  @Mock
  private LearnerRepository learnerRepository;

  private Learner learner;

  @BeforeAll
  public static void beforeAll() {
    System.out.println("Before all tests in LearnerManagementServiceTest");
  }

  @BeforeEach
  public void setup() {
    Learner learner = new Learner(1L, "Test", "test@gmail.com", "123");
    System.out.println("Setting up LearnerManagementServiceTest");
  }


  @Test
  public void testLearnerCreated_Successfully() {

    when(learnerRepository.save(learner)).thenReturn(learner);
    Learner expectedLearner = learnerManagementService.createLearner(learner);
    Assertions.assertEquals("Test", expectedLearner.getLearnerName());
    Assertions.assertEquals("test@gmail.com", expectedLearner.getLearnerEmail());
    Assertions.assertEquals(expectedLearner, learner);
  }

  @Test
  public void testFetchLearnerById_Successfully() throws LearnerNotFoundException {
    Learner learner = new Learner(1L, "Test", "test@gmail.com", "123");
    when(learnerRepository.findById(1L)).thenReturn(Optional.of(learner));
    Learner fetchedLearner = learnerManagementService.fetchLearnerByLearnerId(1L);
    Assertions.assertEquals("Test", fetchedLearner.getLearnerName());
    Assertions.assertEquals("test@gmail.com", fetchedLearner.getLearnerEmail());
    Assertions.assertEquals(fetchedLearner, learner);
  }


  @Test
  public void testFetchLearnerByID_notFound() {
    when(learnerRepository.findById(1L)).thenReturn(Optional.empty());
    Assertions.assertThrows(LearnerNotFoundException.class, () -> {
      learnerManagementService.fetchLearnerByLearnerId(1L);
    });

  }

}
