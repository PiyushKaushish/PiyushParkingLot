package org.airtribe.LearnerManagementSystem.repository;

import java.util.Optional;
import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LearnerRepositoryTest {

  @Autowired
  private LearnerRepository _learnerRepository;

  private Learner _learner;

  private long storedId;


  @BeforeEach
  public void setup() {
    _learner = new Learner();
    _learner.setLearnerName("Test Learner");
    _learner.setLearnerEmail("test@gmail.com");
    _learner.setLearnerPhoneNumber("123");
  }


  @Test
  @Rollback(value = false) // Ensure the test data is not rolled back
  public void testLearnerSucessfuly() {
    Learner savedLearner = _learnerRepository.save(_learner);
    Assertions.assertNotNull(savedLearner);
    storedId = savedLearner.getLearnerId();
    Assertions.assertNotNull(savedLearner.getLearnerId());
    Assertions.assertEquals("Test Learner", savedLearner.getLearnerName());
  }


  @Test
  public void testFetchLearnerByID() {
    Optional<Learner> learnerOptional = _learnerRepository.findById(storedId);
  }

}
