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
public class BookmarkResultDto {
	private int bookmarkSeq;
	private String registerTime;
	
	// 외래키
	private int userSeq;
	private int contentId;
	
	private String title;
	private String addr1;
	private double mapy;
	private double mapx;
	private String firstImage;
}
