package com.paper.papermgt.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.paper.papermgt.model.NoticeModel;
import com.paper.papermgt.model.TopicModel;
import com.paper.papermgt.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/topic")
public class TopicController extends BaseController {

    @Autowired
    private TopicService topicService;

    @PostMapping("/add")
    public ModelAndView add(HttpServletRequest request, ModelAndView modelAndView, TopicModel model) {
        TopicModel topicModel = new TopicModel();
        topicModel.setTeaId(getSession(request).getUsername());
        topicService.add(model);
        modelAndView.setViewName("topic/list");
        return modelAndView;
    }

    @PostMapping("/list")
    public ModelAndView list(HttpServletRequest request, ModelAndView modelAndView, TopicModel model) {
        TopicModel topicModel = new TopicModel();
        topicModel.setTeaId(getSession(request).getUsername());
        topicService.add(model);
        modelAndView.setViewName("topic/list");
        return modelAndView;
    }

    @PostMapping("/{id}/selectTopic")
    public ModelAndView selectTopic(HttpServletRequest request, ModelAndView modelAndView, @PathVariable("id") Integer id) {
        TopicModel topicModel=new TopicModel();
        topicModel.setStuId(getSession(request).getUsername());
        topicModel.setModifyTime(new Date());
        return modelAndView;
    }
}
