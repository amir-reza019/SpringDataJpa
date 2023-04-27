package com.amir.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
