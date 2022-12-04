package com.myjob.checkin.dto;

import io.swagger.annotations.ApiModelProperty;
import javafx.scene.chart.PieChart;
import lombok.Data;

import java.util.Date;

/**
 * @author icyrain11
 * @version 1.8
 */
@Data
public class AbsenceQueryDto {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "班级")
    private String major;

    @ApiModelProperty(value = "周数")
    private int week;

    @ApiModelProperty(value = "开始日期")
    private Date startDate;

    @ApiModelProperty(value = "结束日期")
    private Date endDate;
}
