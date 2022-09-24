package com.standalone.drucare.courseApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.standalone.drucare.courseApi.model.Course;
import com.standalone.drucare.courseApi.service.CourseService;
import com.standalone.drucare.topicApi.model.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/topic/{id}/course")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses(id);
	}
	@GetMapping("/topic/{topicId}/course/{id}")
	public Optional<Course> getCourse(@PathVariable String id){
		return courseService.getCourse(id);
	}
	@PostMapping("/topic/{topicId}/course")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId){
		course.setTopic(new Topic(topicId, "","")); 
		courseService.addCourse(course);
	}
	@PutMapping("/topic/{topicId}/course/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId, "","")); 
		courseService.updateCourse(course);
	}
	@DeleteMapping("/topic/{topicId}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		 courseService.deleteCourse(id);
	}
}