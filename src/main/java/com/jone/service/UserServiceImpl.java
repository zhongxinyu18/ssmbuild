package com.jone.service;

import com.jone.dao.UserMapper;
import com.jone.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int creatUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUserByID(int id) {
        return userMapper.delUserByID(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User findUserByID(int id) {
        return userMapper.queryUserByID(id);
    }

    public User findUserByUP(String userName, String password) {
        return userMapper.queryUserByUP(userName,password);
    }
}
