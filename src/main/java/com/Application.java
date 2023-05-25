package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entity.Course;
import com.entity.Student;
import com.service.CourseService;
import com.service.StudentCourseService;
import com.service.StudentService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CourseService courseService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentCourseService studentCourseService;

	@Resource
	private Student s1;

	@Resource
	private Student s2;

	@Resource
	private Course c1;

	@Resource
	private Course c2;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// ----------------------- CRUD COURSE -----------------------

		// Create di un corso
//		c1.setTitle("Corso Java Spring");
//		c1.setDescription("Descrizione del corso");
//		courseService.createCourse(c1);

		// Delete di un corso (by title)
		// courseService.deleteCourse(courseService.getIdByTitle("Corso Java Spring"));

		// Update di un corso
//		c1.setTitle("Corso Angular");
//		courseService.updateCourse(c1);

		// Read dei corsi
//		courseService.readCourses().forEach(System.out::println);

		// ----------------------- CRUD STUDENT ----------------------

		// Create di uno studente
//		s1.setFirstName("Roberto");
//		s1.setLastName("Graffeo");
//		s1.setEmail("robertograffeo00@gmail.com");
//		s1.setAge(23);
//		studentService.createStudent(s1);

		// Delete di uno studente
		// studentService.deleteStudent(studentService.getIdByEmail("robertograffeo00@gmail.com"));

		// Update di uno studente
//		s1.setAge(99);
//		studentService.updateStudent(s1);

		// Read degli student
//		studentService.readStudents().forEach(System.out::println);

		// -------------------- CRUD STUDENT COURSE --------------------

		// Insert di uno studente e più corsi
//		c1.setTitle("Corso Java Spring");
//		c1.setDescription("Descrizione del corso Java");
//
//		s1.setFirstName("Roberto");
//		s1.setLastName("Graffeo");
//		s1.setEmail("robertograffeo00@gmail.com");
//		s1.setAge(23);
//
//		List<Course> courses = new ArrayList<>();
//		courses.add(c1);
//
//		studentCourseService.createStudentCourses(s1, courses);

		// Insert di un corso e più studenti
//		c1.setCode(null);
//		c1.setTitle("Corso Angular");
//		c1.setDescription("Descrizione del corso Angular");
//
//		s1.setPassportNumber(null);
//		s1.setFirstName("Marco");
//		s1.setLastName("Rosso");
//		s1.setEmail("marcorosso@gmail.com");
//		s1.setAge(21);
//
//		List<Student> students = new ArrayList<>();
//		students.add(s1);
//
//		studentCourseService.createCourseStudents(c1, students);

		// Update dei corsi di uno studente
//		s1.setFirstName("Roberto");
//		s1.setLastName("Graffeo");
//		s1.setEmail("robertograffeo00@gmail.com");
//		s1.setAge(23);
//		studentService.createStudent(s1);
//
//		c1.setTitle("Corso Java");
//		c1.setDescription("Descrizione del corso Java");
//		courseService.createCourse(c1);
//
//		c2.setTitle("Corso Angular");
//		c2.setDescription("Descrizione del corso Angular");
//		courseService.createCourse(c2);
//
//		List<Course> courses = new ArrayList<>();
//		courses.add(c1);
//		courses.add(c2);
//
//		studentCourseService.updateCoursesByStudent(s1, courses);

		// Update degli studenti di un corso
//		s1.setFirstName("Roberto");
//		s1.setLastName("Graffeo");
//		s1.setEmail("robertograffeo00@gmail.com");
//		s1.setAge(23);
//		studentService.createStudent(s1);
//
//		s2.setFirstName("Marco");
//		s2.setLastName("Rosso");
//		s2.setEmail("marcorosso@gmail.com");
//		s2.setAge(18);
//		studentService.createStudent(s2);
//
//		c1.setTitle("Corso Java");
//		c1.setDescription("Descrizione del corso Java");
//		courseService.createCourse(c1);
//
//		List<Student> students = new ArrayList<>();
//		students.add(s1);
//		students.add(s2);
//
//		studentCourseService.updateStudentsByCourse(c1, students);

		// Read di tutti i corsi di uno studente (per email)
//		studentCourseService.readCoursesByStudent("marcorosso@gmail.com").forEach(System.out::println);

		// Read di tutti gli studenti di un corso (per title)
//		studentCourseService.readStudentsByCourse("Corso Java").forEach(System.out::println);
	}

}
