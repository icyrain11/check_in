package com.myjob.checkin.service;

import java.util.List;

import com.myjob.checkin.dto.AbsenceQueryDto;
import com.myjob.checkin.pojo.Absence;
import com.baomidou.mybatisplus.extension.service.IService;
import com.myjob.checkin.vo.AbsenceVo;

/**
 * @author 73493
 * @description 针对表【t_absence(缺勤表)】的数据库操作Service
 * @createDate 2022-12-04 00:37:01
 */
public interface AbsenceService extends IService<Absence> {

    List<AbsenceVo> exportAbsenceInfo(AbsenceQueryDto absenceQueryDto);
}
