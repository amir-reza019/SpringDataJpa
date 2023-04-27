package com.amir.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amir.jpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
