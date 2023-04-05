package com.LearningManagmentSystem.LMS_API.DAO;

import com.LearningManagmentSystem.LMS_API.Entites.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User,Integer> {



}
