package com.myjob.checkin.controller;

import com.alibaba.excel.EasyExcel;
import com.myjob.checkin.dto.AbsenceQueryDto;
import com.myjob.checkin.dto.StudentUploadDto;
import com.myjob.checkin.handler.MyException;
import com.myjob.checkin.service.AbsenceService;
import com.myjob.checkin.service.StudentService;
import com.myjob.checkin.util.AjaxJson;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.apache.poi.ss.formula.functions.T;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author icyrain11
 * @version 1.8
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private AbsenceService absenceService;


    @ApiOperation(value = "通过excel上传学生信息")
    @PostMapping("/uploadStudent")
    public AjaxJson<?> uploadStudent(@RequestParam("file") MultipartFile file) {
        if (file == null) {
            //返回错误
            return AjaxJson.getFailure();
        }

        try {
            studentService.saveStudent(file, studentService);
        } catch (MyException e) {
            return AjaxJson.getFailure(e.getCode(), e.getMsg());
        }

        return AjaxJson.getSuccess("上传成功");
    }

    @ApiOperation("导出学生该周的缺勤信息")
    @PostMapping("/exportAbsenceInfo")
    public AjaxJson<?> exportAbsenceInfo(@RequestBody AbsenceQueryDto absenceQueryDto) {
        //不做分页了直接导出
        if (absenceQueryDto.getStartDate() != null && absenceQueryDto.getEndDate() != null) {
            if (absenceQueryDto.getStartDate().compareTo(absenceQueryDto.getEndDate()) < 0) {
                AjaxJson.getFailure(10002, "开始时间不可以小于结束时间");
            }
        }
        return AjaxJson.getSuccess(absenceService.exportAbsenceInfo(absenceQueryDto));
    }

}
