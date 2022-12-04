package com.myjob.checkin.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author icyrain11
 * @version 1.8
 */
@Data
public class AbsenceVo {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "专业")
    private String major;

    @ApiModelProperty(value = "周数")
    private int week;

    @ApiModelProperty(value = "缺勤日期")
    private Date absenceDay;

}
