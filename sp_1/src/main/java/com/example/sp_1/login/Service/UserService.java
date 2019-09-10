package com.example.sp_1.login.Service;

import com.example.sp_1.login.Dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    /*
     * ͨ��id��ȡ����
     */
    public List findAsset(String id) throws Exception {
        List list = userMapper.queryList(null);
        System.out.println("121212");
        return list;
    }
}
