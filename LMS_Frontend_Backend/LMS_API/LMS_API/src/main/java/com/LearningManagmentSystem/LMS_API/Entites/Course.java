package com.LearningManagmentSystem.LMS_API.Entites;


import jakarta.persistence.*;

@Entity
@Table(name = "CourseTable")
public class Course {

    @Id
    @SequenceGenerator(name = "Course_Id_Generator", sequenceName = "Course_Id_seq",allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Course_Id_Generator")
    private int CourseId;

    private String CourseName;


    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}
