package com.ssafy.finalpjt.follow.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FollowDto {
	private int followSeq;
	private int fromSeq;
	private int toSeq;
	private String followTime;
}

