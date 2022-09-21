package com.dev.courseAPI;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.courseAPI.dao.DAO;
import com.dev.courseAPI.model.Course;

@SpringBootApplication
public class CourseApiApplication {

	private static DAO<Course> dao;


	public CourseApiApplication(DAO<Course> dao) {
		this.dao=dao;

	}


	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args);

		System.out.println("\n create Courses....................................\n");
		Course springValue = new Course("Spring Boot + value","New Course whare kajba ", "https://kjhaejh  udign ewiungekjrgb5735xbvdj ahq3487o5t7834");

		System.out.println("\n create Courses....................................\n");
		Optional<Course> firstOne =dao.get(5);
		System.out.println(firstOne.get());

		springValue.setDescription("Learn very ecitingly and objrctb lway");
		dao.update(springValue, 6);

		dao.delete(2);


		System.out.println("\n All Courses....................................\n");
		List<Course> courses= dao.list();
		courses.forEach(System.out::println);


	}
}