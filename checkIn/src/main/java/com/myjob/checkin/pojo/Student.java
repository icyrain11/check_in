package com.myjob.checkin.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @TableName t_student
 */
@TableName(value = "t_student")
@Data
public class Student implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 所在专业
     */
    private String major;

    /**
     *
     */
    @ApiModelProperty("创建日期")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     *
     */
    @ApiModelProperty("最后修改日期")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}