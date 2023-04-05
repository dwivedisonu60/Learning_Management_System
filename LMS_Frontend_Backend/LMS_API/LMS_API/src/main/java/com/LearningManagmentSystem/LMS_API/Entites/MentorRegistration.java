package com.LearningManagmentSystem.LMS_API.Entites;


import jakarta.persistence.*;

@Entity
@Table(name = "MentorTable")
public class MentorRegistration {

    @Id
    @SequenceGenerator(name = "Mentor_Id_Generator", sequenceName = "Mentor_Id_seq",allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Mentor_Id_Generator")
    private int MentorRegId;

    private int MentorId;

    private int CourseId;

    private String MentorName;

    private String CourseName;


    public MentorRegistration(int mentorId, int courseId, String mentorName, String courseName) {
        MentorId = mentorId;
        CourseId = courseId;
        MentorName = mentorName;
        CourseName = courseName;
    }

    public MentorRegistration(){
        super();
    }

    public int getMentorRegId() {
        return MentorRegId;
    }

    public void setMentorRegId(int mentorRegId) {
        MentorRegId = mentorRegId;
    }

    public int getMentorId() {
        return MentorId;
    }

    public void setMentorId(int mentorId) {
        MentorId = mentorId;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getMentorName() {
        return MentorName;
    }

    public void setMentorName(String mentorName) {
        MentorName = mentorName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}
