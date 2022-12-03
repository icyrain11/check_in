package com.myjob.checkin.mapper;

import com.myjob.checkin.pojo.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myjob.checkin.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 73493
 * @description 针对表【t_student】的数据库操作Mapper
 * @createDate 2022-12-03 22:14:14
 * @Entity com.myjob.checkIn.pojo.Student
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}




