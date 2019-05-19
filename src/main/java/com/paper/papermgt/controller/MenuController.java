package com.paper.papermgt.controller;

import com.common.framework.core.ApiResponse;
import com.paper.papermgt.model.MenuModel;
import com.paper.papermgt.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MenuController extends  BaseController {

  @Autowired private MenuService menuService;

  @GetMapping("/getMenu")
  @ResponseBody
  public ApiResponse<List<MenuModel>> getMenu(HttpServletRequest request) {
    MenuModel model = new MenuModel();
    model.setRoleName(super.getRole(request).getRoleName());
    List<MenuModel> list = menuService.queryList(model, null);
    return new ApiResponse<>(list);
  }
}
