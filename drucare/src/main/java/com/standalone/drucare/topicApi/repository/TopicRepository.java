package com.standalone.drucare.topicApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.standalone.drucare.topicApi.model.Topic;

public interface TopicRepository extends CrudRepository <Topic, String>{

}
