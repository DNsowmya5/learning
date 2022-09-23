package com.dru4care.course.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dru4care.course.module.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{



}