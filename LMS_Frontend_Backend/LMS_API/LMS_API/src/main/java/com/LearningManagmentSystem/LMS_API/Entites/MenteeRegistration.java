package com.LearningManagmentSystem.LMS_API.Entites;

import jakarta.persistence.*;

@Entity
@Table(name = "MenteeTable")
public class MenteeRegistration {

    @Id
    @SequenceGenerator(name = "Mentee_Id_Generator", sequenceName = "Mentee_Id_seq",allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Mentee_Id_Generator")
    private int MenteeRegId;

    private int MenteeId;

    private int CourseId;

    private String MenteeName;

    private String CourseName;

    public MenteeRegistration(int menteeId, int courseId, String menteeName, String courseName) {
        MenteeId = menteeId;
        CourseId = courseId;
        MenteeName = menteeName;
        CourseName = courseName;
    }

    public MenteeRegistration(){
        super();
    }

    public int getMenteeRegId() {
        return MenteeRegId;
    }

    public void setMenteeRegId(int menteeRegId) {
        MenteeRegId = menteeRegId;
    }

    public int getMenteeId() {
        return MenteeId;
    }

    public void setMenteeId(int menteeId) {
        MenteeId = menteeId;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getMenteeName() {
        return MenteeName;
    }

    public void setMenteeName(String menteeName) {
        MenteeName = menteeName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}
