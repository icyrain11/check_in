package com.myjob.checkin.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myjob.checkin.dto.StudentUploadDto;
import com.myjob.checkin.listener.StudentExcelListener;
import com.myjob.checkin.pojo.Student;
import com.myjob.checkin.service.StudentService;
import com.myjob.checkin.mapper.StudentMapper;
import com.myjob.checkin.mapper.StudentMapper;
import com.myjob.checkin.pojo.Student;
import com.myjob.checkin.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 73493
 * @description 针对表【t_student】的数据库操作Service实现
 * @createDate 2022-12-03 22:14:14
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
        implements StudentService {


    @Override
    public void saveStudent(MultipartFile file, StudentService studentService) {
        try {
            InputStream in = file.getInputStream();
            //easeExcel读取数据
            EasyExcel.read(in, StudentUploadDto.class, new StudentExcelListener(studentService)).sheet().doRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




