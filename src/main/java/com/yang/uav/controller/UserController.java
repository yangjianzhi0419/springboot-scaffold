package com.yang.uav.controller;

import com.yang.uav.common.BaseResponse;
import com.yang.uav.common.ResultUtils;
import com.yang.uav.model.entity.User;
import com.yang.uav.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户接口
 *
 * @author LS
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    public BaseResponse<List<User>> list() {
        return ResultUtils.success(userService.list());
    }

    @GetMapping("/hello")
    public BaseResponse<String> hello() {
        return ResultUtils.success("你好！");
    }
}
