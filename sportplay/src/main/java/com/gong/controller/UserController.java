package com.gong.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.gong.pojo.User;
import com.gong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author CodeSniper
 * @since 2021-06-29
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //分页查询所有用户
    @RequestMapping("/user")
    public String getAllUser(@RequestParam("username") String username, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        PageInfo<User> page = userService.getPage(username, pageNum, pageSize);
        return JSON.toJSONString(page);
    }

    //修改状态信息
    @RequestMapping("/state")
    public String updateState(@RequestParam("id") Integer id,
                              @RequestParam("state") Boolean state) {
        int i = userService.updateState(id, state);
        return i > 0 ? "success" : "error";
    }

    //添加用户
    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        user.setRole("普通用户");
        user.setState(false);
        int i = userService.addUser(user);
        return i > 0 ? "success" : "error";
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Integer id) {
        int i = userService.deleteUser(id);
        return i > 0 ? "success" : "error";
    }

    //得到修改的用户
    @RequestMapping("/getUser")
    public String getUser(Integer id) {
        User user = userService.getUserById(id);
        return JSON.toJSONString(user);
    }

    //修改用户
    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user) {
        int i = userService.editUser(user);
        return i > 0 ? "success" : "error";
    }
}
