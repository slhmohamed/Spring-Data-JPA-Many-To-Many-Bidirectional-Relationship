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
@Table(name = "STUDENT_TBL")
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age;
    private String grade;
    private String name;
@ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        @JoinTable(name = "STUDENT_COURSES_TABLE",
        joinColumns = {
                @JoinColumn(name = "student_id",referencedColumnName = "id")
        },inverseJoinColumns = {
                @JoinColumn(name = "course_id" ,referencedColumnName = "id")
        }
        )
    Set<Course> courses;
}
