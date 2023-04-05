package com.LearningManagmentSystem.LMS_API.Controller;

import com.LearningManagmentSystem.LMS_API.DAO.CourseRepository;
import com.LearningManagmentSystem.LMS_API.DAO.MenteeRepository;
import com.LearningManagmentSystem.LMS_API.DAO.MentorRepository;
import com.LearningManagmentSystem.LMS_API.DAO.UserRepository;
import com.LearningManagmentSystem.LMS_API.Entites.MenteeRegistration;
import com.LearningManagmentSystem.LMS_API.Entites.MentorRegistration;
import com.LearningManagmentSystem.LMS_API.Services.CourseController;
import com.LearningManagmentSystem.LMS_API.Services.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/registration")
@ResponseBody

public class RegistrationController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    MenteeRepository menteeRepository;

    @Autowired
    UserController userController;

    @Autowired
    CourseController courseController;

    @Autowired
    MentorRepository mentorRepository;



    @PostMapping(value = "/mentee")
    public boolean RegisterMentee(@RequestBody Map<String ,String> MenteeRegistrationParams){
        boolean isRegSuccess = false;
        List<MenteeRegistration> menteesList = new ArrayList<>();

        String MenteeName = (MenteeRegistrationParams.get("username"));
        String CourseName = (MenteeRegistrationParams.get("coursename"));


        int id = userController.fetchId(MenteeName);
        int courseId = courseController.fetchCourseId(CourseName);
        menteeRepository.save(new MenteeRegistration(id,courseId,MenteeName,CourseName));
        menteesList = menteeRepository.findAll();
        for(int looper=0 ; looper< menteesList.size();looper++)
        {
            if(menteesList.get(looper).getMenteeName().equals(MenteeName))
                if(menteesList.get(looper).getCourseName().equals(CourseName)){
                    isRegSuccess= true;
                }
        }





        return isRegSuccess;


    }

    @PostMapping(value = "/mentor")
    public boolean RegisterMentor(@RequestBody Map<String ,String> MentorRegistrationParams){
        boolean isRegSuccess = false;

        List<MentorRegistration> mentorsList = new ArrayList<>();

        String MentorName = (MentorRegistrationParams.get("username"));
        String CourseName = (MentorRegistrationParams.get("coursename"));

        int id = userController.fetchId(MentorName);
        int courseId = courseController.fetchCourseId(CourseName);
        mentorRepository.save(new MentorRegistration(id,courseId,MentorName,CourseName));
       mentorsList = mentorRepository.findAll();
       for(int looper=0 ; looper< mentorsList.size();looper++)
       {
           if(mentorsList.get(looper).getMentorName().equals(MentorName))
               if(mentorsList.get(looper).getCourseName().equals(CourseName)){
                   isRegSuccess= true;
               }
       }

        return isRegSuccess;


    }






}
