package com.example.sp_1.login.Service;

import com.example.sp_1.login.Dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("userService")
public class UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    /*
     *查找用户登录情况
     */
    public List findUser(Map<String,Object> params) throws Exception {
        List list = userMapper.queryList(params);
        return list;
    }
}
