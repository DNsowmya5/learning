package com.dru4care.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dru4care.course.module.Topic;
import com.dru4care.course.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	 TopicRepository topicRepository;

	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String topicId) {

		return topicRepository.findById(topicId).get();
	}

	public void addTopic(Topic topic) {

		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {

		topicRepository.save(topic);

	}
	
	public void deleteTopic(String id){
		topicRepository.deleteById(id);
	}


}