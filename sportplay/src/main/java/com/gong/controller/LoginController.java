package com.gong.controller;
import com.alibaba.fastjson.JSON;
import com.gong.pojo.User;
import com.gong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    private String login(@RequestBody User user){
        String flag="error";
        User us = userService.getUser(user.getUsername(), user.getPassword());
        HashMap<String, Object> res = new HashMap<>();
        if (us!=null){
            flag="ok";
        }
        res.put("flag",flag);
        res.put("user",us);
        return JSON.toJSONString(res);
    }

}
