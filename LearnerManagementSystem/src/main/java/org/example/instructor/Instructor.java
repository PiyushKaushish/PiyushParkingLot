package org.example.instructor;

public class Instructor {
  private String instructorId;
  private String instructorName;
  private String instructorEmail;

  public Instructor(String instructorId, String instructorName, String instructorEmail) {
    this.instructorId = instructorId;
    this.instructorName = instructorName;
    this.instructorEmail = instructorEmail;
  }

  public String getInstructorId() {
    return instructorId;
  }

  public void setInstructorId(String instructorId) {
    this.instructorId = instructorId;
  }

  public String getInstructorName() {
    return instructorName;
  }

  public void setInstructorName(String instructorName) {
    this.instructorName = instructorName;
  }

  public String getInstructorEmail() {
    return instructorEmail;
  }

  public void setInstructorEmail(String instructorEmail) {
    this.instructorEmail = instructorEmail;
  }
}
