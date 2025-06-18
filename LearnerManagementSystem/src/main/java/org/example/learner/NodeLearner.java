package org.example.learner;

public class NodeLearner extends Learner {

  private int numberOfYearsNodeExperience;
  public NodeLearner(String learnerId, String learnerName, String learnerEmail, int numberOfYearsNodeExperience) {
    super(learnerId, learnerName, learnerEmail);
    this.numberOfYearsNodeExperience = numberOfYearsNodeExperience;
  }

  @Override
  public void displayLearnerDetails() {
    System.out.println("Learner Id: " + getLearnerId());
    System.out.println("Learner Name: " + getLearnerName());
    System.out.println("Learner Email: " + getLearnerEmail());
    System.out.println("Number of Years Node Experience: " + numberOfYearsNodeExperience);
  }
}
