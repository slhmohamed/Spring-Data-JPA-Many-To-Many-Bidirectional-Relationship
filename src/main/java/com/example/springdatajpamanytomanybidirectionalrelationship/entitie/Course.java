package com.example.springdatajpamanytomanybidirectionalrelationship.entitie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COURSE_TBL")
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String abbreviation;
    private double fee;

    private int modules;

    private String title;

    @ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
   private Set<Student> students;
}
