package com.LearningManagmentSystem.LMS_API.Services;

import com.LearningManagmentSystem.LMS_API.DAO.CourseRepository;
import com.LearningManagmentSystem.LMS_API.DAO.MenteeRepository;
import com.LearningManagmentSystem.LMS_API.DAO.MentorRepository;
import com.LearningManagmentSystem.LMS_API.Entites.Course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseController {

    @Autowired
    CourseRepository courseRepository;



    public int fetchCourseId(String CourseName){
        int courseId = 0;

        List<Course> allCourse = new ArrayList<Course>();

        allCourse = courseRepository.findAll();
        for(int i =0 ; i < allCourse.size();i++)
        {
            if(allCourse.get(i).getCourseName().equals(CourseName)){
                courseId = allCourse.get(i).getCourseId();
            }
        }


        return courseId;


    }

    public List<String> fetchOnlyCourseNames(){
        List<String> allCourseNames  = new ArrayList<>();
        List<Course> allCourses = courseRepository.findAll();

        for(int listloop=0; listloop<allCourses.size();listloop++){

            String courseName = allCourses.get(listloop).getCourseName();
            allCourseNames.add(courseName);
        }




        return allCourseNames;
    }






}
