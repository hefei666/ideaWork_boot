package com.example.sp_1.login.Controller;

import javax.servlet.http.HttpServletRequest;


import com.example.sp_1.utils.Redis.RedisService;
import com.example.sp_1.login.Service.UserService;

import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisService redisService;

//    @Autowired
//    RedisConnectionFactory factory;

    @RequestMapping(value = "/queryById")
    public ModelAndView queryById(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String id = request.getParameter("id");
        try {
            List list = userService.findAsset(null);
            System.out.println("121212");
        } catch (Exception e) {

        }
        return mv;
    }


    @ResponseBody//获取数据
    @RequestMapping("/list")
    public Map list(HttpServletRequest request) {
        //查询列表数据
        Map map = new HashMap();
        try {
            List list = userService.findUser(null);
            JSONArray json = JSONArray.fromObject(list);
            map.put("ces", json);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;

    }

    @RequestMapping(value = "gotoActivity")
    public String gotoActivity(HttpServletRequest request) {
        System.out.println("121231");
        return "index";
    }
    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public String redisTest(){
        StringBuffer sb = new StringBuffer();
        redisService.set("str", "str");
        sb.append("str=").append(redisService.get("str").toString()).append(",");
        redisService.hmSet("hmset","key","val");
        sb.append("hmset=").append(redisService.hmGet("hmset","key")).append(",");
        redisService.lPush("list","val");
        sb.append("list=").append(redisService.lRange("list",0,1).toString()).append(",");
        redisService.add("set","val");
        sb.append("set=").append(redisService.setMembers("set").toString()).append(",");
        redisService.zAdd("zset","val1",1);
        redisService.zAdd("zset","val2",2);
        sb.append("zset=").append(redisService.rangeByScore("zset",1,2)).append(",");
        return sb.toString();
    }

}
