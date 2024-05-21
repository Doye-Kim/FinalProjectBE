package com.ssafy.finalpjt.plan.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlanDto {

	private int planSeq;
	private String planDate;
	
	// 외래키
	private int contentId; // 관광지 Id
	private int userSeq; // 유저 seq

	
}
