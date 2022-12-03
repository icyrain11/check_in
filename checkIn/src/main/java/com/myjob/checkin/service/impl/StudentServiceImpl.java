package com.myjob.checkin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myjob.checkin.pojo.Student;
import com.myjob.checkin.service.StudentService;
import com.myjob.checkin.mapper.StudentMapper;
import com.myjob.checkin.mapper.StudentMapper;
import com.myjob.checkin.pojo.Student;
import com.myjob.checkin.service.StudentService;
import org.springframework.stereotype.Service;

/**
* @author 73493
* @description 针对表【t_student】的数据库操作Service实现
* @createDate 2022-12-03 22:14:14
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService {

}




