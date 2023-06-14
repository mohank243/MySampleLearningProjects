package edu.igo.springbootlearning.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	//This is the business service class which is used to provide service for the topics in the Course API
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","spring framework","Learning Spring Framework"),
			new Topic("java","coreJava","Learning Core Java"),
			new Topic("pyton","corePyton","Learning Core Pyton")
			));
	public List<Topic> getAllTopics(){
		return topics;
	}
	//This service is used to provide the individual topic for each id
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.id.equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	public void updateTopic(Topic topic, String id) {
		for(int i=0; i<topics.size();i++ ) {
			if((topics.get(i).getId().equals(id)))
				topics.set(i, topic);
		} 
		
	}
	public void deleteTopic( String id) {
		topics.removeIf(r -> r.getId().equals(id));
	}
}
