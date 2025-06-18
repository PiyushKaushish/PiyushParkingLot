package org.example.course;

import java.util.ArrayList;
import java.util.List;
import org.example.cohort.Cohort;


public abstract class Course {

  private Long courseId;

  private String courseName;

  private String courseDescription;

  private CourseType courseMedium;

  private List<Cohort> cohorts;

  public Course(Long courseId, String courseName, String courseDescription, CourseType courseMedium) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseDescription = courseDescription;
    this.courseMedium = courseMedium;
    this.cohorts = new ArrayList<>();
  }

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseDescription() {
    return courseDescription;
  }

  public void setCourseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
  }

  public CourseType getCourseMedium() {
    return courseMedium;
  }

  public void setCourseMedium(CourseType courseMedium) {
    this.courseMedium = courseMedium;
  }

  public abstract void displayCourseDetails();

  public void addCohortToTheCourse(Cohort cohort) {
    cohorts.add(cohort);
  }

  public void removeCohortFromCourse(Cohort cohort) {
    cohorts.remove(cohort);
  }

  public List<Cohort> getCohorts() {
    return cohorts;
  }

  public void setCohorts(List<Cohort> cohorts) {
    this.cohorts = cohorts;
  }
}

