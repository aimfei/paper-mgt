package com.paper.papermgt.controller;

import com.paper.papermgt.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/notice")
public class NoticeController {

  @Autowired private NoticeService noticeService;

  @GetMapping("/{id}/details")
  public ModelAndView details(ModelAndView modelAndView, @PathVariable("id") Integer id) {
    modelAndView.addObject("notice", noticeService.getById(id));
    modelAndView.setViewName("notice/details");
    return modelAndView;
  }
}
