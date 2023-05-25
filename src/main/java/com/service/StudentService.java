package com.service;

import java.util.List;

import com.entity.Student;
import com.vo.StudentVO;

public interface StudentService {
	public void createStudent(Student student);

	public List<StudentVO> readStudents();

	public void updateStudent(Student student);

	public void deleteStudent(String passportNumber);

	public String getIdByEmail(String email);
}
