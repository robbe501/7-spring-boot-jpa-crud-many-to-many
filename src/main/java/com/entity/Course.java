package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@NamedQueries({
		@NamedQuery(name = "Course.readCourses", query = "SELECT new com.vo.CourseVO(c.code, c.title, c.description) FROM Course c"),
		@NamedQuery(name = "Course.getIdByTitle", query = "SELECT c.code FROM Course c WHERE c.title = :title"),
		@NamedQuery(name = "Course.getCourseByTitle", query = "SELECT c FROM Course c WHERE c.title = :title"),
		@NamedQuery(name = "Course.readCoursesByStudent", query = "SELECT new com.vo.CourseVO(c.code, c.title, c.description) FROM Course c JOIN students s WHERE s.email = :email"), })
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String code;

	private String title;

	private String description;

	@ManyToMany(mappedBy = "courses")
	private List<Student> students = new ArrayList<>();

	public Course(String title, String description) {
		this.title = title;
		this.description = description;
	}

}
