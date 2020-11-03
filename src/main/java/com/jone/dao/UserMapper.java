package com.jone.dao;

import com.jone.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //增加一个用户
    int addUser(User user);
    //删除一个用户
    int delUserByID(@Param("userID") int id);
    //修改一个用户
    int updateUser(User user);
    //根据ID查询一个用户
    User queryUserByID(@Param("userID") int id);
    //根据用户名密码查询一个用户
    User queryUserByUP(@Param("userName") String userName,@Param("password") String password);
}
