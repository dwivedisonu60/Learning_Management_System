package com.LearningManagmentSystem.LMS_API.Controller;

import org.springframework.stereotype.Service;

@Service
public class Role {

    public String Role;

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
