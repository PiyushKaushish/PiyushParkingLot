package org.example;

import org.example.cohort.Cohort;
import org.example.course.CourseType;
import org.example.course.OfflineCourse;
import org.example.course.OnlineCourse;
import org.example.instructor.Instructor;
import org.example.learner.JavaLearner;
import org.example.learner.Learner;
import org.example.learner.NodeLearner;


public class Main {
    public static void main(String[] args) {
        OfflineCourse nodeOfflineCourse = new OfflineCourse(1L, "Test", "Test Course", CourseType.NODE, "Bangalore");
        OfflineCourse javaOfflineCourse = new OfflineCourse(1L, "Test", "Test Course", CourseType.JAVA, "Bangalore");

        OnlineCourse nodeOnlineCourse = new OnlineCourse(1L, "Test", "Test Course", CourseType.NODE, "https://zoom.us/123");
        OnlineCourse javaOnlineCourse = new OnlineCourse(1L, "Test", "Test Course", CourseType.JAVA, "https://zoom.us/456");


        Cohort c1 = new Cohort("1", "Cohort 1", "Cohort 1 Description", new java.util.Date(), new java.util.Date());
        Cohort c2 = new Cohort("2", "Cohort 2", "Cohort 2 Description", new java.util.Date(), new java.util.Date());
        Cohort c3 = new Cohort("3", "Cohort 3", "Cohort 3 Description", new java.util.Date(), new java.util.Date());
        Cohort c4 = new Cohort("4", "Cohort 4", "Cohort 4 Description", new java.util.Date(), new java.util.Date());

        Learner javaLearner1 = new JavaLearner("1", "Java Learner 1", "test", true);
        Learner javaLearner2 = new JavaLearner("2", "Java Learner 2", "test", false);

        Learner nodeLearner1 = new NodeLearner("3", "Node Learner 1", "test", 2);
        Learner nodeLearner2 = new NodeLearner("4", "Node Learner 2", "test", 6);

        Instructor instructor1 = new Instructor("1", "Instructor 1", "test");


        // Map learners to cohorts
        c1.addLearnerToCohort(javaLearner1);
        c1.addLearnerToCohort(nodeLearner2);

        c3.addLearnerToCohort(javaLearner2);
        c4.addLearnerToCohort(nodeLearner1);
        c2.addLearnerToCohort(nodeLearner2);

        // Map instructors to cohorts
        c1.addInstructorToCohort(instructor1);
        c2.addInstructorToCohort(instructor1);
        c3.addInstructorToCohort(instructor1);
        c4.addInstructorToCohort(instructor1);

        // Mapping cohorts to course

        nodeOfflineCourse.addCohortToTheCourse(c1);
        nodeOnlineCourse.addCohortToTheCourse(c2);

        javaOnlineCourse.addCohortToTheCourse(c3);
        javaOfflineCourse.addCohortToTheCourse(c4);

        // Display course details
        nodeOfflineCourse.displayCourseDetails();
        nodeOnlineCourse.displayCourseDetails();
        javaOnlineCourse.displayCourseDetails();
        javaOfflineCourse.displayCourseDetails();



    }
}