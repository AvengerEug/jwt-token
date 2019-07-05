package com.eugene.jwttoken.controller;

import com.eugene.common.peroperty.JwtProperty;
import com.eugene.common.utils.ContextUtil;
import com.eugene.jwttoken.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private JwtProperty jwtProperty;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("请求query参数: " + ContextUtil.getHttpServletRequest().getParameter("heihei"));
        return "Hello jwttoken";
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam String userName,
                        @RequestParam String password) {
        String jwtToken = userService.login(userName, password);
        return jwtToken;
    }
}
