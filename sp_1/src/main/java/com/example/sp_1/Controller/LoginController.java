package com.example.sp_1.Controller;

import com.example.sp_1.Service.RedisService;
import com.example.sp_1.Service.UserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/login")
public class LoginController {

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
            List list = userService.findAsset(null);
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


}
