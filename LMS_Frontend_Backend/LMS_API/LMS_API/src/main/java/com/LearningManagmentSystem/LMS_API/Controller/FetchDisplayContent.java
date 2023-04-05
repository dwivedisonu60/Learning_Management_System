package com.LearningManagmentSystem.LMS_API.Controller;

import com.LearningManagmentSystem.LMS_API.DAO.MenteeRepository;
import com.LearningManagmentSystem.LMS_API.DAO.MentorRepository;
import com.LearningManagmentSystem.LMS_API.DAO.UserRepository;

import com.LearningManagmentSystem.LMS_API.Entites.MenteeRegistration;
import com.LearningManagmentSystem.LMS_API.Entites.MentorRegistration;
import com.LearningManagmentSystem.LMS_API.Services.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/fetch")
@ResponseBody
public class FetchDisplayContent {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserController userController;

    @Autowired
    MentorRepository mentorRepository;

    @Autowired
    MenteeRepository menteeRepository;

    @GetMapping(value = "/Mentor")
    public List<MentorRegistration> FetchMentors(){

        List<MentorRegistration> MentorsList= new ArrayList<>();

        MentorsList = mentorRepository.findAll();

        return MentorsList;
    }

    @GetMapping(value = "/Mentee")
    public List<MenteeRegistration> FetchMentee(){

        List<MenteeRegistration> MenteesList= new ArrayList<>();

        MenteesList = menteeRepository.findAll();

        return MenteesList;
    }



}
