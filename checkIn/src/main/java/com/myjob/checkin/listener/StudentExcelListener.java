package com.myjob.checkin.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.myjob.checkin.dto.StudentUploadDto;
import com.myjob.checkin.handler.MyException;
import com.myjob.checkin.pojo.Student;
import com.myjob.checkin.service.StudentService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author icyrain11
 * @version 1.8
 */
@Slf4j
public class StudentExcelListener extends AnalysisEventListener<StudentUploadDto> {
    public StudentService studentService;

    public StudentExcelListener() {
    }

    public StudentExcelListener(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void invoke(StudentUploadDto studentUploadDto, AnalysisContext analysisContext) {
        if (studentUploadDto == null) {
            throw new RuntimeException("数据为空");
        }

        Student student = existStudent(studentUploadDto);
        log.info("插入学生信息 {}", studentUploadDto.toString());
        if (student == null) {
            student.setName(studentUploadDto.getName());
            student.setMajor(studentUploadDto.getMajor());
            studentService.save(student);
        }

    }

    //重复导入判断
    public Student existStudent(StudentUploadDto studentUploadDto) {
        LambdaQueryWrapper<Student> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Student::getName, studentUploadDto.getName());
        lambdaQueryWrapper.eq(Student::getMajor, studentUploadDto.getMajor());

        return studentService.getOne(lambdaQueryWrapper);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
