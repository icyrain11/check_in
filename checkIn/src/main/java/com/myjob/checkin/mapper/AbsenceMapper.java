package com.myjob.checkin.mapper;

import com.myjob.checkin.dto.AbsenceQueryDto;
import com.myjob.checkin.pojo.Absence;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myjob.checkin.vo.AbsenceVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 73493
 * @description 针对表【t_absence(缺勤表)】的数据库操作Mapper
 * @createDate 2022-12-04 00:37:01
 * @Entity com.myjob.checkIn.pojo.Absence
 */
@Mapper
public interface AbsenceMapper extends BaseMapper<Absence> {

    List<AbsenceVo> exportAbsenceInfo(AbsenceQueryDto absenceQueryDto);

}




