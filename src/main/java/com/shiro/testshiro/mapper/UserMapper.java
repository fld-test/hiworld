package com.shiro.testshiro.mapper;

import com.shiro.testshiro.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;



@Repository
public interface UserMapper{

    @Select("SELECT * FROM sys_users WHERE username = #{username} AND password = #{password}")
    User findUser(@Param("username") String username, @Param("password") String password);


    @Select("SELECT * FROM sys_users WHERE username=#{username}")
    User findUserByUsername(String username);

}
