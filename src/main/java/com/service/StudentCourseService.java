package com.service;

import java.util.List;

import com.entity.Course;
import com.entity.Student;
import com.vo.CourseVO;
import com.vo.StudentVO;

public interface StudentCourseService {

	public void createStudentCourses(Student student, List<Course> courses);

	public void createCourseStudents(Course course, List<Student> students);

	public void updateCoursesByStudent(Student student, List<Course> courses);

	public void updateStudentsByCourse(Course course, List<Student> students);

	public List<CourseVO> readCoursesByStudent(String email);

	public List<StudentVO> readStudentsByCourse(String title);
}
