package com.example.sp_1.login.Controller;

import com.example.sp_1.utils.Redis.RedisService;
import com.example.sp_1.login.Service.UserService;
import com.example.sp_1.utils.ActionResult;
import com.example.sp_1.utils.BasicController;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/login")
public class LoginController extends BasicController {

    @Autowired
    private RedisService redisService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public String gotoActivity(HttpServletRequest request) {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "login")
    public ActionResult login(HttpServletRequest request, HttpSession session) {
        ActionResult actionResult=new ActionResult();
        actionResult.setCode("0000");
        Map<String,Object> params=new HashMap<String,Object>();
        setParams(request,params);
        try {
            List list = userService.findUser(params);
            session.setAttribute("REDIS_ID","12312");
        }catch (Exception e) {
            e.printStackTrace();
        }return actionResult;
    }

}
