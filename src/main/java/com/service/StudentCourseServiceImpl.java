package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Course;
import com.entity.Student;
import com.repository.StudentCourseRepository;
import com.vo.CourseVO;
import com.vo.StudentVO;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {

	@Autowired
	StudentCourseRepository studentCourseRepository;

	@Override
	public void createStudentCourses(Student student, List<Course> courses) {
		try {
			studentCourseRepository.createStudentCourses(student, courses);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

	}

	@Override
	public void createCourseStudents(Course course, List<Student> students) {
		try {
			studentCourseRepository.createCourseStudents(course, students);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

	}

	@Override
	public void updateCoursesByStudent(Student student, List<Course> courses) {
		try {
			studentCourseRepository.updateCoursesByStudent(student, courses);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

	}

	@Override
	public void updateStudentsByCourse(Course course, List<Student> students) {
		try {
			studentCourseRepository.updateStudentsByCourse(course, students);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

	}

	@Override
	public List<CourseVO> readCoursesByStudent(String email) {
		List<CourseVO> courses = new ArrayList<>();
		try {
			courses = studentCourseRepository.readCoursesByStudent(email);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

		return courses;
	}

	@Override
	public List<StudentVO> readStudentsByCourse(String title) {
		List<StudentVO> students = new ArrayList<>();
		try {
			students = studentCourseRepository.readStudentsByCourse(title);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

		return students;
	}

}
