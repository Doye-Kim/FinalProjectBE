package com.ssafy.finalpjt.comment.dto;

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
public class CommentDto {

	
	private int commentSeq;
    private String commentContent;
    private String commentTime;
    
    // 외래키
    private int postSeq;
    private int userSeq;
    
}
