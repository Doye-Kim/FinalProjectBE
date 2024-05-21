package com.ssafy.finalpjt.plan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.plan.dao.PlanDao;
import com.ssafy.finalpjt.plan.dto.PlanDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlanServiceImpl implements PlanService{

	
	private final PlanDao planDao;
	
	@Override
	public int insertPlan(PlanDto planDto) {
		return planDao.insertPlan(planDto);
	}

	@Override
	public int deletePlan(int planSeq) {
		return planDao.deletePlan(planSeq);
	}

	@Override
	public List<PlanDto> listPlan() {
		return planDao.listPlan();
	}

}
