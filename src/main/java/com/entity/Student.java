package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@NamedQueries({
		@NamedQuery(name = "Student.readStudents", query = "SELECT new com.vo.StudentVO(s.passportNumber, s.firstName, s.lastName, s.email, s.age) FROM Student s"),
		@NamedQuery(name = "Student.getIdByEmail", query = "SELECT s.passportNumber FROM Student s WHERE s.email = :email"),
		@NamedQuery(name = "Student.readStudentsByCourse", query = "SELECT new com.vo.StudentVO(s.passportNumber, s.firstName, s.lastName, s.email, s.age) FROM Student s JOIN courses c WHERE c.title = :title"),

})
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "passport_number")
	private String passportNumber;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "age")
	private Integer age;

	@ManyToMany
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "passport_number"), inverseJoinColumns = @JoinColumn(name = "code"))
	private List<Course> courses = new ArrayList<>();

	public Student(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

}
