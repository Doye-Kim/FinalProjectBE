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

	@PostMapping("/plans")
	public int insertPlan(@RequestBody PlanDto planDto) {
	    return planService.insertPlan(planDto);
	}

	@DeleteMapping("/plans/{planSeq}")
	public int deletePlan(@PathVariable int planSeq) {
	    return planService.deletePlan(planSeq);
	}

    @GetMapping("/plans")
    public List<PlanDto> listPlan() {
        return planService.listPlan();
    }
}
