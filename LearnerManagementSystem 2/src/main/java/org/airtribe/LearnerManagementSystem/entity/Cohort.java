package org.airtribe.LearnerManagementSystem.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;


@Entity
public class Cohort {
  @Id
  @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
  private Long cohortId;

  private String cohortName;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  private List<Learner> learnerList;

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  @ManyToOne
  private Course course;

  public Cohort(Long cohortId, String cohortName) {
    this.cohortId = cohortId;
    this.cohortName = cohortName;
  }

  public Cohort() {
  }

  public Long getCohortId() {
    return cohortId;
  }

  public void setCohortId(Long cohortId) {
    this.cohortId = cohortId;
  }

  public String getCohortName() {
    return cohortName;
  }

  public void setCohortName(String cohortName) {
    this.cohortName = cohortName;
  }

  public List<Learner> getLearnerList() {
    return learnerList;
  }

  public void setLearnerList(List<Learner> learnerList) {
    this.learnerList = learnerList;
  }
}
