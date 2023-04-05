package com.LearningManagmentSystem.LMS_API.DAO;

import com.LearningManagmentSystem.LMS_API.Entites.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
