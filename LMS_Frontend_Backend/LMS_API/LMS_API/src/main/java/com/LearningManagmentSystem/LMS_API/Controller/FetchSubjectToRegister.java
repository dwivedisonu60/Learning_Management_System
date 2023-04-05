package com.LearningManagmentSystem.LMS_API.Controller;


import com.LearningManagmentSystem.LMS_API.DAO.CourseRepository;
import com.LearningManagmentSystem.LMS_API.DAO.MenteeRepository;
import com.LearningManagmentSystem.LMS_API.DAO.MentorRepository;
import com.LearningManagmentSystem.LMS_API.Entites.MenteeRegistration;
import com.LearningManagmentSystem.LMS_API.Entites.MentorRegistration;
import com.LearningManagmentSystem.LMS_API.Services.CourseController;
import com.LearningManagmentSystem.LMS_API.Services.UserCourseFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/getSubject")
@ResponseBody
public class FetchSubjectToRegister {

    @Autowired
    MenteeRepository menteeRepository;

    @Autowired
    MentorRepository mentorRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    UserCourseFetcher userCourseFetcher;

    @Autowired
    CourseController courseController;


    @PostMapping(value = "/Mentee")
    public List<String> fetchForMentee(@RequestBody Map<String,String>BodyParam){
        String Username = BodyParam.get("username");
        List<String> availableToRegister = new ArrayList<>();
        availableToRegister =courseController.fetchOnlyCourseNames();


        List<MenteeRegistration> MenteeRegistered = userCourseFetcher.FetchMenteeCourseForUsername(Username);
        if(MenteeRegistered.size()>0) {
            for (int listloop = 0; listloop < MenteeRegistered.size(); listloop++) {
                availableToRegister.remove(MenteeRegistered.get(listloop).getCourseName());
            }
        }

        return availableToRegister;
    }
    @PostMapping(value = "/Mentor")
    public List<String> fetchForMentor(@RequestBody Map<String,String>BodyParam){
        String Username = BodyParam.get("username");
        List<String> availableToRegister = new ArrayList<>();
        availableToRegister =courseController.fetchOnlyCourseNames();
        List<MentorRegistration> MentorRegistered = userCourseFetcher.FetchMentorCourseForUsername(Username);
        for(int listloop =0 ; listloop < MentorRegistered.size();listloop++)
        {
            availableToRegister.remove(MentorRegistered.get(listloop).getCourseName());
        }
        return availableToRegister;

    }


}
