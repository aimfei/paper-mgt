package com.paper.papermgt.controller;

import com.paper.papermgt.model.*;
import com.paper.papermgt.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/mgt")
public class MgtController extends BaseController {

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private DeptService deptService;

    @Autowired
    private ClassService classService;

    @Autowired
    private UserService userService;

    @Autowired
    private NoticeService noticeService;


    @RequestMapping("/{mgtType}/addPager")
    public ModelAndView addCollPager(HttpServletRequest request, ModelAndView modelAndView, @PathVariable("mgtType") Integer mgtType) {

        List<CollegeModel> collList=  collegeService.queryList(new CollegeModel(), null);
        List<DeptModel>  deptList=  deptService.queryList(new DeptModel(), null);
        List<ClassModel>  classList= classService.queryList(new ClassModel(), null);
        modelAndView.addObject("collList",collList);
        modelAndView.addObject("deptList",deptList);
        modelAndView.addObject("classList",classList);
        switch (mgtType) {
            case 1:
                modelAndView.setViewName("mgt/add_college");
                break;

            case 2:

                modelAndView.setViewName("mgt/add_dept");
                break;
            case 3:
                modelAndView.setViewName("mgt/add_class");
                break;
            case 4:
                modelAndView.setViewName("mgt/add_personal");
                break;
            case 5:
                modelAndView.setViewName("mgt/add_notice");
        }


        return modelAndView;
    }

    @RequestMapping("/addCollege")
    public ModelAndView addCollege(HttpServletRequest request, ModelAndView modelAndView, CollegeModel model) {

        collegeService.add(model);
        return addCollPager(request,modelAndView,1);
    }

    @RequestMapping("/addDept")
    public ModelAndView addDept(HttpServletRequest request, ModelAndView modelAndView, DeptModel deptModel) {
        deptService.add(deptModel);
        return addCollPager(request,modelAndView,2);
    }

    @RequestMapping("/addClass")
    public ModelAndView addClass(HttpServletRequest request, ModelAndView modelAndView, ClassModel classModel) {
        classService.add(classModel);
        return addCollPager(request,modelAndView,3);
    }

    @RequestMapping("/addPersonal")
    public ModelAndView addPersonal(HttpServletRequest request, ModelAndView modelAndView, UserModel userModel) {
        userModel.setPassword(userModel.getUsername());
        userService.add(userModel);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/addNotice")
    public ModelAndView addNotice(HttpServletRequest request, ModelAndView modelAndView, NoticeModel noticeModel) {
        noticeService.add(noticeModel);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/{type}/{id}/delete")
    public ModelAndView delete(HttpServletRequest request, ModelAndView modelAndView,  @PathVariable("type")  Integer type, @PathVariable("id")  Integer id) {
        if (type==1){
            collegeService.deleteById(id);
        }else if (type==2){
            deptService.deleteById(id);
        }else  if (type==3){
            classService.deleteById(id);
        }
        modelAndView.setViewName("index");
        return modelAndView;
    }
}


