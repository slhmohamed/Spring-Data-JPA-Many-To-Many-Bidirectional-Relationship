package com.example.springdatajpamanytomanybidirectionalrelationship.repository;

import com.example.springdatajpamanytomanybidirectionalrelationship.entitie.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByNameContaining(String name);
}
