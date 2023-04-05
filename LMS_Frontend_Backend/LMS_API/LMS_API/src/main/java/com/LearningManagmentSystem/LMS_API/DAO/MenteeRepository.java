package com.LearningManagmentSystem.LMS_API.DAO;

import com.LearningManagmentSystem.LMS_API.Entites.MenteeRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenteeRepository extends JpaRepository<MenteeRegistration,Integer> {
}
