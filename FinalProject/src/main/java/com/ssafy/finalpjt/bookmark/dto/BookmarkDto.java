package com.ssafy.finalpjt.bookmark.dto;

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
public class BookmarkDto {
	private int bookmarkSeq;
	private String registerTime;
	
	// 외래키
	private int userSeq;
	private int contentId;
}
