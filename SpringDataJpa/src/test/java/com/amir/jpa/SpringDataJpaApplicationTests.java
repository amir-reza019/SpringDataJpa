package com.amir.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.amir.jpa.model.Student;
import com.amir.jpa.repo.StudentRepository;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeNotNull;

import java.util.Optional;

@SpringBootTest
class SpringDataJpaApplicationTests {
	
	@Autowired
	StudentRepository repo;

	
	
	
	@Test
	void studentSave() {
		Student s = new Student();
		s.setId(1l);
		s.setName("amir");
		s.setTestScore(100);
		
		Student stud = repo.save(s);
		assertNotNull(stud);
		
	}
	
	@Test
	void findStudentById() {
		Optional<Student> s = repo.findById(1l);
		System.out.println(s);
		assertNotNull(s);
		
	}
	
//	@Test
//	void deleteStudentById() {
//		repo.deleteById(1l);
//		Optional<Student> s = repo.findById(1l);
//		System.out.println(s);
//		
//	}
	
	@Test
	void updateStudent() {
		Optional<Student> st = repo.findById(1l);
		Student s = st.get();
		long id =1l;
		if(s.getId() == id)
		s.setName("Sonu");
			
		System.out.println(s);
		
		
	}
	

}
