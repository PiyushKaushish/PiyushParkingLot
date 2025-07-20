package org.airtribe.LearnerManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.util.List;


@Entity
public class Learner {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long learnerId;

  @NotBlank
  @NotNull
  private String learnerName;

  @Email
  private String learnerEmail;

  @ManyToMany(mappedBy = "learnerList")
  @JsonIgnore
  private List<Cohort> cohorts;

  @Positive
  private String learnerPhoneNumber;

  public Learner(long learnerId, String learnerName, String learnerEmail, String learnerPhoneNumber) {
    this.learnerId = learnerId;
    this.learnerName = learnerName;
    this.learnerEmail = learnerEmail;
    this.learnerPhoneNumber = learnerPhoneNumber;
  }

  public Learner() {

  }

  public long getLearnerId() {
    return learnerId;
  }

  public void setLearnerId(long learnerId) {
    this.learnerId = learnerId;
  }

  public String getLearnerName() {
    return learnerName;
  }

  public void setLearnerName(String learnerName) {
    this.learnerName = learnerName;
  }

  public String getLearnerEmail() {
    return learnerEmail;
  }

  public void setLearnerEmail(String learnerEmail) {
    this.learnerEmail = learnerEmail;
  }

  public String getLearnerPhoneNumber() {
    return learnerPhoneNumber;
  }

  public void setLearnerPhoneNumber(String learnerPhoneNumber) {
    this.learnerPhoneNumber = learnerPhoneNumber;
  }

  public List<Cohort> getCohorts() {
    return cohorts;
  }

  public void setCohorts(List<Cohort> cohorts) {
    this.cohorts = cohorts;
  }
}
