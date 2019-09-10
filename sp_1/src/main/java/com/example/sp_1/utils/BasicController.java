package com.example.sp_1.utils;

import com.example.sp_1.utils.Redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.Map;

public class BasicController {

    @Autowired
    private RedisService redisService;

    public void setParams(HttpServletRequest request, Map params) {
        if (params != null) {
            params.clear();
        }
        try {
            HttpSession session=request.getSession();
            String redis_id=String.valueOf(session.getAttribute("REDIS_ID"));
            Object redis_map=redisService.get(redis_id);
            params.put("user_info",redis_map);
            Enumeration enr = request.getParameterNames();
            while (enr.hasMoreElements()) {
                String key = String.valueOf(enr.nextElement());
                params.put(key, request.getParameter(key));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
