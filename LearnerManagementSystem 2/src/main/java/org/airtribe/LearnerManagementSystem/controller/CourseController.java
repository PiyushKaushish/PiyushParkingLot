package org.airtribe.LearnerManagementSystem.controller;

import org.airtribe.LearnerManagementSystem.entity.Course;
import org.airtribe.LearnerManagementSystem.service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {

  @Autowired
  private LearnerManagementService learnerManagementService;

  @PostMapping("/courses")
  public Course createCourse(@RequestBody Course course) {
    // Logic to create a course
    return learnerManagementService.createCourse(course);
  }
}
