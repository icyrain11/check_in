package com.myjob.checkin.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_student
 */
@TableName(value ="t_student")
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
    private Date createTime;

    /**
     * 
     */
    private Date modifyTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}