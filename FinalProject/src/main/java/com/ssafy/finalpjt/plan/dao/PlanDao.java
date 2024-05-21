package com.ssafy.finalpjt.plan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.plan.dto.PlanDto;

@Mapper
public interface PlanDao {

	int insertPlan(PlanDto planDto);
    int deletePlan(int planSeq);
    List<PlanDto> listPlan();
}
