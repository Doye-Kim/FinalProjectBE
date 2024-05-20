package com.ssafy.finalpjt.plan.service;

import java.util.List;

import com.ssafy.finalpjt.plan.dto.PlanDto;

public interface PlanService {
	int insertPlan(PlanDto planDto);
    int deletePlan(int planSeq);
    List<PlanDto> listPlan();
}
