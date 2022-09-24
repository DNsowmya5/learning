package com.standalone.drucare.courseApi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.standalone.drucare.courseApi.model.Course;

public interface CourseRepository extends CrudRepository <Course, String>{

	public List<Course> findByTopicId(String topicId);

}
