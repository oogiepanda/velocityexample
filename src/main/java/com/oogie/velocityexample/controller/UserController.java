package com.oogie.velocityexample.controller;

import com.oogie.velocityexample.service.ServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private ServiceFacade userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String userInfo(@ModelAttribute("model") ModelMap model) throws Exception {
        model.addAttribute("users", userService.doService("get"));
        return "userInfos";
    }
}
