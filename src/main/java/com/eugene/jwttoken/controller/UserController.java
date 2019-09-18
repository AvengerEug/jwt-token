package com.eugene.jwttoken.controller;

import com.eugene.common.controller.BaseController;
import com.eugene.common.exception.BusinessException;
import com.eugene.common.web.http.Message;
import com.eugene.jwttoken.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public Message login(@RequestParam String userName,
                         @RequestParam String password) throws BusinessException {
        String jwtToken = userService.login(userName, password);
        return Message.ok(jwtToken);
    }

    @GetMapping(value = "/fetch-all-info")
    public Message fetchAllInfo() {
        return Message.ok(userService.fetchAllInfo());
    }

    @PutMapping(value = "/{userId}")
    public Message updateUserById(@PathVariable(value = "userId") Integer userId) {
        return Message.ok("PathVariable: " + userId);
    }

    @DeleteMapping(value = "/delete-user")
    public Message deleteUserById(@RequestParam(value = "userId") Integer userId) {
        return Message.ok("RequestParam: " + userId);
    }
}
