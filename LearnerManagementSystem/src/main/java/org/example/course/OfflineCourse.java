package org.example.course;

public class OfflineCourse extends Course {

  private String location;
  public OfflineCourse(Long courseId, String courseName, String courseDescription, CourseType courseMedium, String location) {
    super(courseId, courseName, courseDescription, courseMedium);
    this.location = location;
  }

  public OfflineCourse(Long courseId, String courseName, String courseDescription, CourseType courseType) {
    super(courseId, courseName, courseDescription, courseType);
    this.location = "Bangalore";
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Id: " + getCourseId());
    System.out.println("Course Name: " + getCourseName());
    System.out.println("Course Description: " + getCourseDescription());
    System.out.println("Course Medium: " + getCourseMedium().toString());
    System.out.println("Location: " + this.location);
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
