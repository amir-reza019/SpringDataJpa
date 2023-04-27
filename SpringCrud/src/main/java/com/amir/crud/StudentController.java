package com.amir.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amir.crud.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	@PostMapping("/stud")
	public void saveStudent(@RequestBody Student s) {
		repo.save(s);
	}
	
	@GetMapping("/stud")
	public List<Student> fetchAllStudent(){
		return repo.findAll();
		
	}
	
	@GetMapping("/stud/{id}")
	public Optional<Student> fetchByIdStudent(@PathVariable int id){
		return repo.findById(id);
		
	}

	
	@DeleteMapping("/stud/{id}")
	public void deleteOneStudent(@PathVariable int id){
		repo.deleteById(id);
		
	}
	
	@PutMapping("/stud")
	public void updateStudent(@RequestBody Student s) {
		repo.save(s);
	}
	

}
