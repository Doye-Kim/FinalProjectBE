package com.ssafy.finalpjt.plan.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.plan.dto.PlanDto;
import com.ssafy.finalpjt.plan.service.PlanService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PlanController {
	
	private final PlanService planService;

	// 등록
	@PostMapping("/plans")
	public int insertPlan(@RequestBody PlanDto planDto) {
	    return planService.insertPlan(planDto);
	}

	// 삭제
	@DeleteMapping("/plans/{planSeq}")
	public int deletePlan(@PathVariable("planSeq") int planSeq) {
	    return planService.deletePlan(planSeq);
	}

	// 조회
    @GetMapping("/plans/{userSeq}")
    public List<PlanDto> listPlan(@PathVariable("userSeq") int userSeq) {
        return planService.listPlan(userSeq);
    }
    
    // 월별 조회
    @GetMapping("/plans/{userSeq}/{year}/{month}")
    public List<PlanDto> listPlanMonth(@PathVariable("userSeq") int userSeq, @PathVariable("year") int year, @PathVariable("month") int month) {
        return planService.listPlanMonth(userSeq, year, month);
    }
}
