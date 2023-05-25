package com.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Course;
import com.entity.Student;
import com.vo.CourseVO;
import com.vo.StudentVO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class StudentCourseRepositoryImpl implements StudentCourseRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void createStudentCourses(Student student, List<Course> courses) {
		student.setCourses(courses);
		for (Course c : courses) {
			em.persist(c);
		}
		em.persist(student);

	}

	@Override
	public void createCourseStudents(Course course, List<Student> students) {
		em.persist(course);
		for (Student s : students) {
			s.getCourses().add(course);
			em.persist(s);
		}

	}

	@Override
	public void updateCoursesByStudent(Student student, List<Course> courses) {
		student.setCourses(courses);
		em.merge(student);

	}

	@Override
	public void updateStudentsByCourse(Course course, List<Student> students) {
		for (Student s : students) {
			s.getCourses().add(course);
			em.merge(s);
		}

	}

	@Override
	public List<CourseVO> readCoursesByStudent(String email) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Course.readCoursesByStudent", CourseVO.class).setParameter("email", email)
				.getResultList();
	}

	@Override
	public List<StudentVO> readStudentsByCourse(String title) {
		return em.createNamedQuery("Student.readStudentsByCourse", StudentVO.class).setParameter("title", title)
				.getResultList();
	}

}
