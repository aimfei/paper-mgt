package com.paper.papermgt.controller;

import com.paper.papermgt.model.TopicModel;
import com.paper.papermgt.model.UserModel;
import com.paper.papermgt.service.TopicService;
import com.paper.papermgt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/topic")
public class TopicController extends BaseController {

    @Autowired
    private TopicService topicService;

    @Autowired
    private UserService userService;


    @GetMapping("/addPager")
    public ModelAndView addPager(HttpServletRequest request, ModelAndView modelAndView) {
        modelAndView.setViewName("topic/add");
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView add(HttpServletRequest request, ModelAndView modelAndView, TopicModel model) {

        model.setTeaId(getSession(request).getUsername());
        model.setCreateTime(new Date());
        model.setModifyTime(new Date());
        topicService.add(model);
        return list(request, modelAndView);
    }

    @GetMapping("/list")
    public ModelAndView list(HttpServletRequest request, ModelAndView modelAndView) {
        TopicModel topicModel = new TopicModel();
        List<TopicModel> list = topicService.queryList(topicModel, null);
        modelAndView.addObject("topicTists", list);
        modelAndView.setViewName("topic/list");
        return modelAndView;
    }

    @GetMapping("/auditList")
    public ModelAndView auditList(HttpServletRequest request, ModelAndView modelAndView) {
        TopicModel topicModel = new TopicModel();
        topicModel.setState("待审核");
        List<TopicModel> list = topicService.queryList(topicModel, null);
        modelAndView.addObject("topicTists", list);
        modelAndView.setViewName("topic/au_list");
        return modelAndView;
    }

    @RequestMapping("/{id}/{state}/audit")
    public ModelAndView audit(HttpServletRequest request, ModelAndView modelAndView, @PathVariable("state") Integer state, @PathVariable("id") Integer id) {
        String statemsg = "已审核";
        if (state == 2) {
            statemsg = "已拒绝";
        }
        TopicModel topicModel = new TopicModel();
        topicModel.setId(id);
        topicModel.setState(statemsg);
        topicService.updateBySelective(topicModel);
        return auditList(request, modelAndView);

    }

    @GetMapping("/stuList")
    public ModelAndView stuList(HttpServletRequest request, ModelAndView modelAndView) {
        modelAndView.setViewName("topic/stu_list");
        UserModel userModel = getSession(request);
        TopicModel topicModel1 = new TopicModel();
        topicModel1.setStuId(userModel.getUsername());
        topicModel1 = topicService.getOneBySelective(topicModel1);
        if (topicModel1 != null) {
            modelAndView.addObject("select", false);
            modelAndView.addObject("topic", topicModel1);
            modelAndView.setViewName("topic/my_topic");
            return modelAndView;
        } else {
            modelAndView.addObject("select", true);
        }

        TopicModel topicModel = new TopicModel();

        UserModel teachModel = new UserModel();
        teachModel.setCollegeid(userModel.getCollegeid());
        List<UserModel> teachList = userService.queryList(teachModel, null);

        if (teachList == null) {
            return modelAndView;
        }


        List<String> teaIds = teachList.parallelStream().map(x -> {
            return x.getUsername();
        }).distinct().collect(Collectors.toList());


        List<TopicModel> list = topicService.getList(teaIds);
        modelAndView.addObject("topicLists", list);
        return modelAndView;
    }


    @GetMapping("/{id}/selectTopic")
    public ModelAndView selectTopic(HttpServletRequest request, ModelAndView modelAndView, @PathVariable("id") Integer id) {
        TopicModel topicModel = new TopicModel();
        topicModel.setId(id);
        topicModel.setStuId(getSession(request).getUsername());
        topicModel.setModifyTime(new Date());
        topicService.updateBySelective(topicModel);
        return stuList(request, modelAndView);
    }

    @GetMapping("/{id}/details")
    public ModelAndView details(ModelAndView modelAndView, @PathVariable("id") Integer id) {
        modelAndView.addObject("topic", topicService.getById(id));
        modelAndView.setViewName("topic/details");
        return modelAndView;
    }

    @RequestMapping("/uploadPager")
    public ModelAndView uploadPager(ModelAndView modelAndView){
        modelAndView.setViewName("topic/upload");
        return modelAndView;
    }

    @PostMapping("/upload")
    public ModelAndView upload(ModelAndView modelAndView,MultipartFile topicFile){

        //获取文件名eques
        String fileName = topicFile.getOriginalFilename();
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //重新生成文件名
        fileName = UUID.randomUUID()+suffixName;
        //指定本地文件夹存储图片
        String filePath = "/Users/flying/tmp/";
        modelAndView.setViewName("index");
        try {
            //将图片保存到static文件夹里
            topicFile.transferTo(new File(filePath+fileName));
//            return new Massage(0,"success to upload");
        } catch (Exception e) {
            e.printStackTrace();
//            return new Massage(-1,"fail to upload");
        }
        modelAndView.addObject("errorInfo","上传成功");
        modelAndView.setViewName("topic/upload");
        return modelAndView;
    }
}
