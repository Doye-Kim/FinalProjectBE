package com.ssafy.finalpjt.view.dto;

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
public class ViewDto {
	private int viewSeq;
	
	// 외래키
	private int userSeq;
	private int postSeq;
}
