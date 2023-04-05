package com.LearningManagmentSystem.LMS_API.DAO;

import com.LearningManagmentSystem.LMS_API.Entites.MentorRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<MentorRegistration,Integer> {
}
