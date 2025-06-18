package org.example.cohort;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.example.instructor.Instructor;
import org.example.learner.Learner;


public class Cohort {
    private String cohortId;
    private String cohortName;
    private String cohortDescription;

    private Date startDate;

    private Date endDate;

    private List<Learner> learners;

    private List<Instructor> instructors;

    public Cohort(String cohortId, String cohortName, String cohortDescription) {
        this.cohortId = cohortId;
        this.cohortName = cohortName;
        this.cohortDescription = cohortDescription;
        this.learners = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }

  public Cohort(String cohortId, String cohortName, String cohortDescription, Date startDate, Date endDate) {
    this.cohortId = cohortId;
    this.cohortName = cohortName;
    this.cohortDescription = cohortDescription;
    this.startDate = startDate;
    this.endDate = endDate;
    this.learners = new ArrayList<>();
    this.instructors = new ArrayList<>();
  }

  public String getCohortId() {
    return cohortId;
  }

  public void setCohortId(String cohortId) {
    this.cohortId = cohortId;
  }

  public String getCohortName() {
    return cohortName;
  }

  public void setCohortName(String cohortName) {
    this.cohortName = cohortName;
  }

  public String getCohortDescription() {
    return cohortDescription;
  }

  public void setCohortDescription(String cohortDescription) {
    this.cohortDescription = cohortDescription;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public List<Learner> addLearnerToCohort(Learner learner) {
    learners.add(learner);
    return learners;
  }

  public List<Instructor> addInstructorToCohort(Instructor instructor) {
    instructors.add(instructor);
    return instructors;
  }

  public List<Learner> getLearners() {
    return learners;
  }

  public List<Instructor> getInstructors() {
    return instructors;
  }

  public void displayCohortDetails() {
    System.out.println("Cohort ID: " + cohortId);
    System.out.println("Cohort Name: " + cohortName);
    System.out.println("Cohort Description: " + cohortDescription);
    System.out.println("Start Date: " + startDate);
    System.out.println("End Date: " + endDate);

    System.out.println("Learners in Cohort:");
    for (Learner learner : learners) {
      learner.displayLearnerDetails();
    }

    System.out.println("Instructors in Cohort:");
    for (Instructor instructor : instructors) {
      System.out.println("Instructor ID: " + instructor.getInstructorId());
      System.out.println("Instructor Name: " + instructor.getInstructorName());
      System.out.println("Instructor Email: " + instructor.getInstructorEmail());
    }
  }
}
