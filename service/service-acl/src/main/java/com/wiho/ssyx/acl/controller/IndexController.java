package com.wiho.ssyx.acl.controller;

import com.wiho.ssyx.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wiho
 * @Date 2023/6/29 23:25
 * @Description 后台登录接口
 * @Since version-1.0
 */
@Api(tags = "后台登录管理")
@RestController
@RequestMapping("/admin/acl/index")
@CrossOrigin
public class IndexController {

    @ApiOperation("登录")
    @PostMapping("login")
    public Result login() {
        Map<String, String> map = new HashMap<>();
        map.put("token", "token-admin");
        return Result.ok(map);
    }

    @ApiOperation("获取用户信息")
    @GetMapping("info")
    public Result getInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "admin");
        map.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    @ApiOperation("登出")
    @PostMapping("logout")
    public Result logout() {
        return Result.ok();
    }
}
