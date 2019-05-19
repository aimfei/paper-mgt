package com.paper.papermgt.controller;


import com.paper.papermgt.model.ClassModel;
import com.paper.papermgt.model.CollegeModel;
import com.paper.papermgt.model.DeptModel;
import com.paper.papermgt.model.UserModel;
import com.paper.papermgt.service.ClassService;
import com.paper.papermgt.service.CollegeService;
import com.paper.papermgt.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private ClassService classService;

    @GetMapping("/personalInfo")
    public ModelAndView personalInfo(HttpServletRequest request,ModelAndView modelAndView){
        UserModel  userModel=super.getSession(request);

        DeptModel deptModel=deptService.getById(userModel.getDeptid());
        CollegeModel collegeModel=collegeService.getById(userModel.getCollegeid());
        ClassModel classModel=classService.getById(userModel.getClassid());

        modelAndView.addObject("user",userModel);
        modelAndView.addObject("dept",deptModel.getDname());
        modelAndView.addObject("college",collegeModel.getCname());
        modelAndView.addObject("className",classModel.getCname());
        modelAndView.setViewName("user/personal_info");
        return modelAndView;
    }
}
