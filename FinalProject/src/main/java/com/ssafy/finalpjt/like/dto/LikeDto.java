package com.ssafy.finalpjt.like.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LikeDto {
	private int likeSeq;
	private String likeTime;
	
	// 외래키
	private int userSeq;
	private int postSeq;

}
