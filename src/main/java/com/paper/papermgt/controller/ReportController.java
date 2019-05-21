package com.paper.papermgt.controller;


import com.paper.papermgt.model.ReportModel;
import com.paper.papermgt.model.TopicModel;
import com.paper.papermgt.model.UserModel;
import com.paper.papermgt.service.ReportService;
import com.paper.papermgt.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/report")
public class ReportController extends  BaseController {

    @Autowired
    private TopicService topicService;

    @Autowired
    private ReportService reportService;

    @RequestMapping("/details")
    public ModelAndView getReport(HttpServletRequest request,ModelAndView modelAndView){
        UserModel userModel=getSession(request);
        TopicModel topicModel=new TopicModel();
        topicModel.setStuId(userModel.getUsername());
        topicModel=topicService.getOneBySelective(topicModel);
        modelAndView.addObject("topic",topicModel);
        if (topicModel!=null){
            ReportModel reportModel=new ReportModel();
            reportModel.setTaskid(topicModel.getId());
            reportModel=reportService.getOneBySelective(reportModel);
            if (reportModel==null){
                reportModel=new ReportModel();
                reportModel.setTaskid(topicModel.getId());
            }
            modelAndView.addObject("report",reportModel);
        }
        modelAndView.setViewName("report/details");
        return modelAndView;

    }

    @RequestMapping("/submit")
    public ModelAndView submit(HttpServletRequest request, ModelAndView modelAndView, ReportModel report){
        ReportModel reportModel=new ReportModel();
        reportModel.setTaskid(reportModel.getTaskid());
        reportModel=reportService.getOneBySelective(reportModel);
        if (reportModel!=null){
            reportService.updateBySelective(report);
        }else{
            reportService.add(report);
        }

        return getReport(request,modelAndView);

    }


}
