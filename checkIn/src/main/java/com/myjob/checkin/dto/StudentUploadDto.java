package com.myjob.checkin.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author icyrain11
 * @version 1.8
 */
@Data
public class StudentUploadDto {

    @ApiModelProperty(value = "姓名")
    @ExcelProperty(value = "字符串标题", index = 1)
    private String name;

    @ApiModelProperty(value = "班级")
    @ExcelProperty(value =  "班级" , index = 3)
    private String major;
}
