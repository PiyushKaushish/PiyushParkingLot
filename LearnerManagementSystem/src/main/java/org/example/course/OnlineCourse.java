package org.example.course;

public class OnlineCourse extends Course {

  private String zoomUrl;
  public OnlineCourse(Long courseId, String courseName, String courseDescription, CourseType courseMedium, String zoomUrl) {
    super(courseId, courseName, courseDescription, courseMedium);
    this.zoomUrl = zoomUrl;
  }

  public OnlineCourse(Long courseId, String courseName, String courseDescription, CourseType courseType) {
    super(courseId, courseName, courseDescription, courseType);
    this.zoomUrl = "Bangalore";
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Id: " + getCourseId());
    System.out.println("Course Name: " + getCourseName());
    System.out.println("Course Description: " + getCourseDescription());
    System.out.println("Course Medium: " + getCourseMedium().toString());
    System.out.println("ZoomUrl: " + this.zoomUrl);
    for (int i = 0; i < getCohorts().size(); i++) {
      getCohorts().get(i).displayCohortDetails();
    }
  }

  public String getZoomUrl() {
    return zoomUrl;
  }

  public void setZoomUrl(String zoomUrl) {
    this.zoomUrl = zoomUrl;
  }
}
