package com.mappings.ServicesInterface;

import com.mappings.Entity.Student;

public interface StudentService {
	
	public Student postStudent(Student s);
	public Student getStudent(Long sid);
//	public Student updateStudent(Long sid,Student s);
	public Student updateStudent(Student s);
	public String deleteStudent(Long sid);

}
