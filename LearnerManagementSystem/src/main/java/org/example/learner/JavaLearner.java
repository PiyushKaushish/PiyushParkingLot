package org.example.learner;

public class JavaLearner extends Learner {

  private boolean knowsMultithreading;
  public JavaLearner(String learnerId, String learnerName, String learnerEmail, boolean knowsMultithreading) {
    super(learnerId, learnerName, learnerEmail);
    this.knowsMultithreading = knowsMultithreading;
  }

  @Override
  public void displayLearnerDetails() {
    System.out.println("Learner Id: " + getLearnerId());
    System.out.println("Learner Name: " + getLearnerName());
    System.out.println("Learner Email: " + getLearnerEmail());
    System.out.println("Knows Multithreading: " + knowsMultithreading);
  }
}
