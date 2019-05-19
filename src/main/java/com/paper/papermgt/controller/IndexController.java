package com.paper.papermgt.controller;

import com.common.framework.pagination.Pager;
import com.paper.papermgt.model.NoticeModel;
import com.paper.papermgt.model.UserModel;
import com.paper.papermgt.service.NoticeService;
import com.paper.papermgt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.security.krb5.internal.PAData;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private UserService userService;


    @GetMapping("/index")
    public ModelAndView index(ModelAndView modelAndView){

        Pager pager=new Pager();
        pager.setPageSize(5);
        pager.setSort("time");
        pager.setOrder(Pager.DESC);

        modelAndView.setViewName("index");
        NoticeModel noticeModel=new NoticeModel();
        noticeModel.setScope("all");
        modelAndView.addObject("sysNoticeList",noticeService.queryList(noticeModel,pager));
        modelAndView.addObject("collNoticeList",noticeService.queryList(noticeModel,pager));
        return modelAndView;
    }


    @GetMapping("/loginPager")
    public ModelAndView loginPager(ModelAndView modelAndView){
        modelAndView.setViewName("login");
        return modelAndView;
    }



    @PostMapping("/login")
    public  ModelAndView login(HttpServletRequest request,ModelAndView modelAndView,String username,String password){
        UserModel userModel=new UserModel();
        userModel.setUsername(username);
        userModel=userService.getOneBySelective(userModel);
        if (userModel==null){
            modelAndView.setViewName("login");
            modelAndView.addObject("errInfo","未找到该用户信息");
            return modelAndView;

        }
        if (!userModel.getPassword().equals(password)){
            modelAndView.setViewName("login");
            modelAndView.addObject("errInfo","用户名或者密码错误");
            return modelAndView;
        }

        request.getSession().setAttribute("user",userModel);


        return  index(modelAndView);

    }
}
