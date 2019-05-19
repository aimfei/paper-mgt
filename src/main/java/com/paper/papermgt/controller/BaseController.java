package com.paper.papermgt.controller;

import com.paper.papermgt.enums.RoleEnum;
import com.paper.papermgt.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    public UserModel getSession(HttpServletRequest request) {
        return (UserModel) request.getSession().getAttribute("user");
    }

    public RoleEnum getRole(HttpServletRequest request){
        UserModel user= getSession(request);
        return RoleEnum.getRole(user.getRole());
    }
}
