package org.airtribe.LearnerManagementSystem.controller;

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.airtribe.LearnerManagementSystem.exception.LearnerNotFoundException;
import org.airtribe.LearnerManagementSystem.service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LearnerController {

  @Autowired
  private LearnerManagementService _learnerManagementService;

  @PostMapping("/learners")
  public Learner createLearner(@Valid @RequestBody Learner learner) {
    return _learnerManagementService.createLearner(learner);
  }

  @GetMapping("/learners")
  public List<Learner> fetchLearnersMultiMode(
      @RequestParam(value="learnerName", required = false) String learnerName,
      @RequestParam(value="learnerId", required = false) Long learnerId
  ) throws LearnerNotFoundException {
    if (learnerName == null && learnerId == null) {
      return _learnerManagementService.fetchAllLearners();
    }

    List<Learner> learnersList = new ArrayList<>();
    if (learnerId != null) {

      Learner learner = _learnerManagementService.fetchLearnerByLearnerId(learnerId);
      learnersList.add(learner);
      return learnersList;
    }

    Learner learner = _learnerManagementService.fetchLearnerByName(learnerName);
    learnersList.add(learner);
    return learnersList;
  }

  @ExceptionHandler(LearnerNotFoundException.class)
  public ResponseEntity handleLearnerNotFoundException(LearnerNotFoundException e) {
    return ResponseEntity.status(404).body(e.getMessage());
  }
}

// "/learners"
// "/learners/learnerId?learnerName=test"
// "/learners/learnerName"
// "/learners?learnerId=1"
// "/learners?learnerName=John"
// "/learners?learnerId=1&learnerName=John"


// "/learners/cohorts?learnerId=1
// "/learners/1/chorts"


// "/learners/1?learnerName=1&learnerId=1"