package com.ssafy.finalpjt.plan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.finalpjt.plan.dto.PlanDto;

@Mapper
public interface PlanDao {

	int insertPlan(PlanDto planDto);
    int deletePlan(int planSeq);
    List<PlanDto> listPlan(int userSeq);
    
    // 월별 조회
    List<PlanDto> listPlanMonth(@Param("userSeq") int userSeq, @Param("month") int month);
}
