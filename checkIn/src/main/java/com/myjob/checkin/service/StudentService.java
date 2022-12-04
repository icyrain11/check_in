package com.myjob.checkin.service;

import com.myjob.checkin.pojo.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.myjob.checkin.pojo.Student;
import org.springframework.web.multipart.MultipartFile;

/**
* @author 73493
* @description 针对表【t_student】的数据库操作Service
* @createDate 2022-12-03 22:14:14
*/
public interface StudentService extends IService<Student> {

    void saveStudent(MultipartFile file, StudentService studentService);
}
