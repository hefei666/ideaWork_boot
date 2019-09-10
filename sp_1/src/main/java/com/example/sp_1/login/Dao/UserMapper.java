package com.example.sp_1.login.Dao;


import com.example.sp_1.login.Entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> queryList(Map<String, Object> params);


}