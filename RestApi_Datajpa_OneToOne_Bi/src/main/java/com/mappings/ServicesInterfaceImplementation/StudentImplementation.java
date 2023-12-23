package com.mappings.ServicesInterfaceImplementation;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappings.Entity.Student;
import com.mappings.Repository.StudentRepository;
import com.mappings.ServicesInterface.StudentService;

@Service
public class StudentImplementation implements StudentService {

	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentImplementation(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}
//	Here, you have a constructor for the StudentImplementation class. 
//	The @Autowired annotation on the constructor is used to tell Spring to inject an instance of StudentRepository 
//	into this constructor when creating an instance of StudentImplementation
	@Override
	public Student postStudent(Student s) {
		
		return studentRepository.save(s);
	}

	@Override
	public Student getStudent(Long sid) {
	Optional<Student> s=studentRepository.findById(sid);
	if(s.isPresent()) {
		return s.get();
	}
	else {
		return null;
	}
	}

//	@Override
//	public Student updateStudent(Long sid, Student s) {
//		Student student=studentRepository.getReferenceById(sid);
//		
//		if(Objects.nonNull(s.getS_name()) && !"".equalsIgnoreCase(s.getS_name())) {
//			student.setS_name(null);
//		}
//		
//		if(Objects.nonNull(s.getBook().getB_name()) && !"".equalsIgnoreCase(s.getBook().getB_name())) {
//			student.setBook(s.getBook());
//		}
//		
//		return student;
//	}

	@Override
	public String deleteStudent(Long sid) {
		if(sid==null) {
			return "Enter a Number";
		}
		else {
			studentRepository.deleteById(sid);
			return "Deleted Successfully";
		}
		
	}
	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

}
