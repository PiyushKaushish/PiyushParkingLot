package org.airtribe.LearnerManagementSystem.controller;

import java.util.List;
import org.airtribe.LearnerManagementSystem.entity.Cohort;
import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.airtribe.LearnerManagementSystem.service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CohortController {

  @Autowired
  private LearnerManagementService _learnerManagementService;

  @PostMapping("/cohorts")
  public Cohort createCohort(@RequestBody Cohort cohort) {
    // Logic to create a cohort
    return _learnerManagementService.createCohort(cohort);
  }

  @PostMapping("/assignLearnersToCohorts")
  public Cohort assignLearnersToCohorts(@RequestParam("learnerId") Long learnerId,
      @RequestParam("cohortId") Long cohortId) {
    // Logic to assign learners to cohorts
    return _learnerManagementService.assignLearnersToCohort(learnerId, cohortId);
  }

  @GetMapping("/cohorts")
  public List<Cohort> getAllCohorts() {
    // Logic to fetch all cohorts
    return _learnerManagementService.fetchAllCohorts();
  }

  @PostMapping("/cohorts/{cohortId}/learners")
  public Cohort assignAndCreateLearnersToCohorts(@RequestBody List<Learner> learners,
      @PathVariable("cohortId") Long cohortId) {
    // Logic to assign and create learners to cohorts
    return _learnerManagementService.assignAndCreateLearnersToCohort(learners, cohortId);
  }
}

// 1000 -> 1 cohort

// body -> Learner objects
// parent child relationships

// /cohorts/1/learners
// /courses/1/cohorts
// courses/1/cohorts/1/learners