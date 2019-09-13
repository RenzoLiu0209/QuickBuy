package com.renzo.onlinestore.controller;


import com.renzo.onlinestore.api.redisapi.RedisService;
import com.renzo.onlinestore.model.User;
import com.renzo.onlinestore.redis.rediskey.UserKey;
import com.renzo.onlinestore.result.CodeMsg;
import com.renzo.onlinestore.result.Result;
import com.renzo.onlinestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public Result<String> hello() {
        return Result.success("I am good!");
    }

    @RequestMapping("/helloError")
    @ResponseBody
    public Result<String> helloerror() {
        return Result.error(CodeMsg.ERROR);
    }


    @RequestMapping("/dbget")
    @ResponseBody
    public Result<User> aaa(Model model) {
        User user = userService.getById(1);
        return Result.success(user);
    }

    @RequestMapping("/dbtx")
    @ResponseBody
    public Result<Boolean> aaatx(Model model) {
        boolean flay = userService.tx();
        return Result.success(true);
    }

    @RequestMapping("/redisGet")
    @ResponseBody
    public Result<User> aaaxx(Model model) {
        User v1 = redisService.get(UserKey.getById, "1", User.class);
        return Result.success(v1);
    }

    @RequestMapping("/redisSet")
    @ResponseBody
    public Result<Boolean> aaaxdddx(Model model) {
        User u = new User();
        u.setId(1);
        u.setName("aaaaa");
        boolean v2 = redisService.set(UserKey.getById, "1", u);
        return Result.success(v2);
    }
}
