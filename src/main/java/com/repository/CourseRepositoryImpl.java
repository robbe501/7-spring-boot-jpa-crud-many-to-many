package com.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Course;
import com.vo.CourseVO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CourseRepositoryImpl implements CourseRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void createCourse(Course course) {
		em.persist(course);
	}

	@Override
	public List<CourseVO> readCourses() {
		return em.createNamedQuery("Course.readCourses", CourseVO.class).getResultList();
	}

	@Override
	public void updateCourse(Course course) {
		em.merge(course);

	}

	@Override
	public void deleteCourse(String courseId) {
		em.remove(em.find(Course.class, courseId));

	}

	public String getIdByTitle(String title) {
		return em.createNamedQuery("Course.getIdByTitle", String.class).setParameter("title", title).getSingleResult();
	}

}
