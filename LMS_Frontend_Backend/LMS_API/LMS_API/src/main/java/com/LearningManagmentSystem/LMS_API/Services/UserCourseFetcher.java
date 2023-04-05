package com.LearningManagmentSystem.LMS_API.Services;

import com.LearningManagmentSystem.LMS_API.DAO.MenteeRepository;
import com.LearningManagmentSystem.LMS_API.DAO.MentorRepository;
import com.LearningManagmentSystem.LMS_API.Entites.MenteeRegistration;
import com.LearningManagmentSystem.LMS_API.Entites.MentorRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class UserCourseFetcher {

    @Autowired
    MenteeRepository menteeRepository;

    @Autowired
    MentorRepository mentorRepository;

    public List<MenteeRegistration> FetchMenteeCourseForUsername(String Username){

        List<MenteeRegistration> usersCourses = new ArrayList<>();
        List<MenteeRegistration> allMenteeCourse = new ArrayList<>();
        allMenteeCourse = menteeRepository.findAll();


        for(int loopstart=0; loopstart<allMenteeCourse.size();loopstart++)
        {
            if(allMenteeCourse.get(loopstart).getMenteeName().equals(Username))
               usersCourses.add(allMenteeCourse.get(loopstart));
        }



        return usersCourses;
    }

    public List<MentorRegistration> FetchMentorCourseForUsername(String Username){
        List<MentorRegistration> usersCourses = new ArrayList<>();
        List<MentorRegistration> allMentorCourse = new ArrayList<>();
        allMentorCourse = mentorRepository.findAll();


        for(int loopstart=0; loopstart<allMentorCourse.size();loopstart++)
        {
            if(allMentorCourse.get(loopstart).getMentorName().equals(Username))
                usersCourses.add(allMentorCourse.get(loopstart));
        }



        return usersCourses;
    }
}
