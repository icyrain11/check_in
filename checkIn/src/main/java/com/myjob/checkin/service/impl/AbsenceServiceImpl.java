package com.myjob.checkin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myjob.checkin.dto.AbsenceQueryDto;
import com.myjob.checkin.mapper.AbsenceMapper;
import com.myjob.checkin.pojo.Absence;
import com.myjob.checkin.service.AbsenceService;
import com.myjob.checkin.mapper.AbsenceMapper;
import com.myjob.checkin.vo.AbsenceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 73493
 * @description 针对表【t_absence(缺勤表)】的数据库操作Service实现
 * @createDate 2022-12-04 00:37:01
 */
@Service
public class AbsenceServiceImpl extends ServiceImpl<AbsenceMapper, Absence>
        implements AbsenceService {

    @Autowired
    private AbsenceMapper absenceMapper;

    @Override
    public List<AbsenceVo> exportAbsenceInfo(AbsenceQueryDto absenceQueryDto) {
        return absenceMapper.exportAbsenceInfo(absenceQueryDto);
    }
}




