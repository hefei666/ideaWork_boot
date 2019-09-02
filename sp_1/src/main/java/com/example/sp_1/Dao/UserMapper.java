package com.example.sp_1.Dao;


import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<?> queryList(Map<String, Object> params);


}