package com.paper.papermgt.controller;

import com.paper.papermgt.model.TopicModel;
import com.paper.papermgt.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/test")
    public ModelAndView getTest(ModelAndView modelAndView){
        TopicModel topic= topicService.getById(1);
        modelAndView.setViewName("hello");
        modelAndView.addObject("topic",topic);
        modelAndView.addObject("test","zhanghsan");
        return modelAndView;
    }

}
