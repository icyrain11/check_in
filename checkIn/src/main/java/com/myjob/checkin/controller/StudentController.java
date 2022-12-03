package com.myjob.checkin.controller;

import com.alibaba.excel.EasyExcel;
import com.myjob.checkin.util.AjaxJson;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author icyrain11
 * @version 1.8
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @ApiOperation(value = "通过excel上传学生信息")
    @PostMapping("/uploadStudent")
    public AjaxJson<?> uploadStudent(@RequestParam("file") MultipartFile file) {
        if (file == null) {
            //返回错误
            return AjaxJson.getFailure();
        }

        return AjaxJson.getSuccess("上传成功");
    }

}
