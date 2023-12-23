package com.mappings.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mappings.Entity.Student;
import com.mappings.ServicesInterfaceImplementation.StudentImplementation;

@RestController
public class StudentController {
	
	private final StudentImplementation studentImplementation;
	
	@Autowired
	public StudentController(StudentImplementation studentImplementation) {
		this.studentImplementation=studentImplementation;
	}
	
	@PostMapping("/post")
	public ResponseEntity<Student> postStudent(@RequestBody Student student) {
		
		Student status=studentImplementation.postStudent(student);
		
		return new ResponseEntity<Student>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id) {
		
		Student status=studentImplementation.getStudent(id);
		
		return new ResponseEntity<Student>(status,HttpStatus.OK);
	}
	
	
	@PutMapping("/update/{id}")
//	public ResponseEntity<Student> updateStudent(@PathVariable Long id,@RequestBody Student student) {
//		
//		Student status=studentImplementation.updateStudent(id, student);
//		
//		return new ResponseEntity<Student>(status,HttpStatus.OK);
//	}
	
	
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		
		Student status=studentImplementation.updateStudent(student);
		
		return new ResponseEntity<Student>(status,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
		
		String status=studentImplementation.deleteStudent(id);
		
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
}
