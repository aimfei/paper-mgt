package com.paper.papermgt.controller;

import com.paper.papermgt.model.ClassModel;
import com.paper.papermgt.model.CollegeModel;
import com.paper.papermgt.model.DeptModel;
import com.paper.papermgt.service.ClassService;
import com.paper.papermgt.service.CollegeService;
import com.paper.papermgt.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/mgt")
public class MgtController extends BaseController {

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private DeptService deptService;

    @Autowired
    private ClassService classService;


    @RequestMapping("/{mgtType}/addPager")
    public ModelAndView addCollPager(HttpServletRequest request, ModelAndView modelAndView, @PathVariable("mgtType") Integer mgtType) {

        switch (mgtType) {
            case 1:
                modelAndView.setViewName("mgt/add_college");
                break;

            case 2:
                modelAndView.setViewName("mgt/add_dept");
                modelAndView.addObject("collList", collegeService.queryList(new CollegeModel(), null));
                break;
            case 3:
                modelAndView.setViewName("mgt/add_class");
                modelAndView.addObject("collList", collegeService.queryList(new CollegeModel(), null));
                modelAndView.addObject("deptList", deptService.queryList(new DeptModel(), null));
                ;
        }


        return modelAndView;
    }

    @RequestMapping("/addCollege")
    public ModelAndView addCollege(HttpServletRequest request, ModelAndView modelAndView, CollegeModel model) {
        modelAndView.setViewName("index");
        collegeService.add(model);
        return modelAndView;
    }

    @RequestMapping("/addDept")
    public ModelAndView addDept(HttpServletRequest request, ModelAndView modelAndView, DeptModel deptModel) {
        deptService.add(deptModel);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/addClass")
    public ModelAndView addClass(HttpServletRequest request, ModelAndView modelAndView, ClassModel classModel) {
        classService.add(classModel);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}


