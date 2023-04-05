package com.LearningManagmentSystem.LMS_API.Controller;



import com.LearningManagmentSystem.LMS_API.DAO.UserRepository;
import com.LearningManagmentSystem.LMS_API.Entites.User;

import com.LearningManagmentSystem.LMS_API.Services.UserController;
import com.LearningManagmentSystem.LMS_API.config.JSONStringConverter;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/authenticate")


public class Authenticate {



    @Autowired
    UserController userController;
    @Autowired
    UserRepository userRepository;







    @PostMapping(value = "/login",produces= MediaType.APPLICATION_JSON_VALUE)
    public String ValidateLogin(@RequestBody Map<String, String>BodyParameters ) throws JsonProcessingException {
        String username = BodyParameters.get("username");
        String password =  BodyParameters.get("password");
        Role role = new Role();
        JSONStringConverter jsonStringConverter = new JSONStringConverter();
        String JsonString= "";
        String userRole ="";
        boolean isUserFound = false;
        boolean didPasswordMatch = false;
        String Password = String.valueOf(password.hashCode());
        isUserFound= userController.getUsers(username);

        if(isUserFound) {
            didPasswordMatch=  userController.doesPasswordsMatch(username,Password);

        }
        if(didPasswordMatch) {
            userRole = userController.fetchRole(username);
            role.setRole(userRole);
            JsonString=  jsonStringConverter.toJSONString(role);


        }

     return JsonString;
    }

    @PostMapping(value = "/signup")
    public  boolean ValidateSignup(@RequestBody Map<String, String>BodyParameters){
        String username = BodyParameters.get("username");
        String password =  BodyParameters.get("password");
        String email =  BodyParameters.get("email");
        String role = BodyParameters.get("role");


        boolean isRegistered = false;
        boolean savedUser = false;
        String Password = String.valueOf(password.hashCode());
        userRepository.save(new User(username,role,Password,email));
       savedUser = userController.getUsers(username);
       if(savedUser)
           isRegistered  = true;


        return isRegistered;
    }

}
