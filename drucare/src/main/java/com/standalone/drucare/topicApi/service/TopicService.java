package com.standalone.drucare.topicApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.standalone.drucare.topicApi.model.Topic;
import com.standalone.drucare.topicApi.repository.TopicRepository;

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