package com.gong.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gong.mapper.UserMapper;
import com.gong.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CodeSniper
 * @since 2021-06-28
 */

@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser( String username, String password) {
        return userMapper.getUser(username,password);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<User> getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public PageInfo<User> getPage(String username,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(userMapper.getUserByName(username));
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
    @Override
    public int updateState(Integer id, Boolean state) {
        return userMapper.updateState(id,state);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public int editUser(User user) {
        return userMapper.editUser(user);
    }


}
