package com.LearningManagmentSystem.LMS_API.Services;

import com.LearningManagmentSystem.LMS_API.DAO.UserRepository;
import com.LearningManagmentSystem.LMS_API.Entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserController {


     @Autowired
     UserRepository userRepository;

    public boolean getUsers(String Username)
    {
        boolean isFound = false;
        List<User> allUser = new ArrayList<User>();
        allUser = userRepository.findAll();
        for(int i =0 ; i < allUser.size();i++)
        {
            if(allUser.get(i).getName().equals(Username)){
                isFound= true;
            }
        }
        return isFound;
    }

    public boolean doesPasswordsMatch(String username,String Password){
        boolean isMatched = false;
        boolean didTheyMatch = false;
        List<User> allUsers = new ArrayList<User>();
        allUsers = userRepository.findAll();

        for(int i =0 ; i < allUsers.size();i++)
        {
            if(allUsers.get(i).getName().equals(username)){
                if(allUsers.get(i).getPassword().equals(Password))
                {
                    didTheyMatch = true;
                    if(didTheyMatch)
                    {
                        isMatched= true;
                        break;
                    }
                }

            }
        }
        return isMatched;
    }

    public String fetchRole(String username)
    {
        String Role = "";
        List<User> allUsers = new ArrayList<User>();
        allUsers = userRepository.findAll();
        for(int loopstart =0 ; loopstart < allUsers.size();loopstart++)
        {

            if(allUsers.get(loopstart).getName().equals(username)) {
                Role = allUsers.get(loopstart).getRole();
            }
        }

        return Role;

    }


    public int fetchId(String username)
    {
        int  userId =0;
        List<User> allUsers = new ArrayList<User>();
        allUsers = userRepository.findAll();
        for(int start =0 ; start < allUsers.size();start++)
        {
            if(allUsers.get(start).getName().equals(username)) {
                userId = allUsers.get(start).getId();
            }
        }

        return userId;

    }

}
