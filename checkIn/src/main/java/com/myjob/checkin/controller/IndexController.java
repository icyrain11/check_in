package com.myjob.checkin.controller;

import com.myjob.checkin.util.AjaxJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author icyrain11
 * @version 1.8
 */
@Api(tags = "首页模块")
@RestController
public class IndexController {
    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation(value = "向客人问好")
    @GetMapping("/sayHi")
    public AjaxJson<?> sayHi(@RequestParam(value = "name") String name) {
        return AjaxJson.getSuccess("hi" + name);
    }
}
