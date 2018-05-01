package com.citi.mybatis;

import com.citi.entities.User;

import java.util.List;

//https://blog.csdn.net/winter_chen001/article/details/77249029
public interface UserMapper {

//    int deleteByPrimaryKey(Integer id);
//
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    User selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);

     List<User> getAllUser();
}
