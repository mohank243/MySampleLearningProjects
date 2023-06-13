package edu.igo.springbootlearning.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.igo.springbootlearning.topic.Topic;
import edu.igo.springbootlearning.topic.TopicService;

@RestController
public class HelloController {
	@Autowired
	private TopicService topicService;
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi User";
	}
	
	//Here the the response for the Http request is coverted into Json and it will be displayed as json
	@RequestMapping("/topics")
	public List<Topic> topics(){
		return topicService.getAllTopics();
				
	}
	@RequestMapping("/topics/{id}")//Variable Path
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	//Posting a new topic
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic ) {
		topicService.addTopic(topic);
	}
	
	
}
