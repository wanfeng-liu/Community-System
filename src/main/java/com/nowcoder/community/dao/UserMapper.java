package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

 @Mapper
//@Repository
public interface UserMapper {
    //根据id查找user
    User selectById(int id);

    //根据用户名查找user
    User selectByName(String username);

    //根据邮箱查找user
    User selectByEmail(String email);

    //插入用户（返回插入的行数）
    int insertUser(User user);

    //修改状态（返回改变的行数，根据id修改状态）
    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
