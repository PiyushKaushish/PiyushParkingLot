package org.airtribe.LearnerManagementSystem.controller.v1;

import org.airtribe.LearnerManagementSystem.entity.Cohort;
import org.airtribe.LearnerManagementSystem.entity.PagedResponse;
import org.airtribe.LearnerManagementSystem.service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
public class CohortV1Controller {

  @Autowired
  private LearnerManagementService learnerManagementService;


  @GetMapping("/cohorts")
  public PagedResponse<Cohort> getCohorts(
      @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
      @RequestParam(value = "sortBy", defaultValue = "cohortId") String sortBy,
      @RequestParam(value = "pageNumber", defaultValue = "0") int pageNumber,
      @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir
  ) {
     if (pageNumber < 0) {
       pageNumber = 0;
     }

     if (pageSize > 2000) {
        pageSize = 10;
     }

     if (!(sortBy.equals("cohortId") || sortBy.equals("cohortName"))) {
       sortBy = "cohortId";
     }

      if (!(sortDir.equals("asc") || sortDir.equals("desc"))) {
        sortDir = "asc";
      }

      Sort.Direction direction;
      if (sortDir.equals("asc")) {
         direction = Sort.Direction.ASC;
      } else {
        direction = Sort.Direction.DESC;
    }


      return learnerManagementService.getPaginatedCohorts(pageSize, sortBy, pageNumber, direction);
  }

}



