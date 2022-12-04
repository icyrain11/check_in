package com.myjob.checkin.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 缺勤表
 * @TableName t_absence
 */
@TableName(value ="t_absence")
@Data
public class Absence implements Serializable {
    /**
     * 自增id
     */
    @TableId
    private Long id;

    /**
     * 
     */
    private Long studentId;

    /**
     * 缺勤周次
     */
    private Integer absenctWeek;

    /**
     * 
     */
    private Date absenceDay;

    /**
     * 
     */
    private Integer absenceCount;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date modifyTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}