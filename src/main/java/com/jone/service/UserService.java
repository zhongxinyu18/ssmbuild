package com.jone.service;

import com.jone.po.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    //增加一个用户
    int creatUser(User user);
    //删除一个用户
    int deleteUserByID(int id);
    //修改一个用户
    int updateUser(User user);
    //根据ID查询一个用户
    User findUserByID(int id);
    //根据用户名密码查询一个用户
    User findUserByUP(String userName,String password);
}
