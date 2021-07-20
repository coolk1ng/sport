package com.gong.service;

import com.github.pagehelper.PageInfo;
import com.gong.pojo.User;


import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */

public interface UserService {
    //根据信息查询用户
    User getUser(String username, String password);

    //查询所有用户
    List<User> getAllUser();

    //根据用户名查询
    List<User> getUserByName(String username);

    //分页根据用户查询
    PageInfo<User> getPage(String username,int pageNum,int pageSize);

    //添加用户
    int addUser(User user);

    //修改状态信息
    int updateState(Integer id,Boolean state);

    //删除用户
    int deleteUser(Integer id);

    //根据id查询用户
    User getUserById(Integer id);

    //修改用户
    int editUser(User user);
}
