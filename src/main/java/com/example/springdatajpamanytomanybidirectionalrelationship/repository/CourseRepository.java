package com.example.springdatajpamanytomanybidirectionalrelationship.repository;

import com.example.springdatajpamanytomanybidirectionalrelationship.entitie.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findByFeeLessThan(double fee);
}
