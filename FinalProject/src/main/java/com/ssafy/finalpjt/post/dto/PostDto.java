package com.ssafy.finalpjt.post.dto;

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
public class PostDto {

	private int postSeq;
	private String postTitle;
	private String postContent;
	private String postTime;
	private String updateTime;
	private int likeCount;
	private int viewCount;
	
	//외래키
	private int userSeq;

}
