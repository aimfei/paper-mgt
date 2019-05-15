package com.paper.papermgt.controller;

import com.paper.papermgt.model.TopicModel;
import com.paper.papermgt.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/test")
    public Object getTest(){
        TopicModel topic= topicService.getById(1);
        return topic;
    }
}
