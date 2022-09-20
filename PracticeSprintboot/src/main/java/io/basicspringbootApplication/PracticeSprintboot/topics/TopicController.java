package io.basicspringbootApplication.PracticeSprintboot.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("java","java dec","jjaavvaa"),
				new Topic ("Spring","Spring boot","Sp"),
				new Topic("java Script","java Desc","javas"));
	}
	
}
