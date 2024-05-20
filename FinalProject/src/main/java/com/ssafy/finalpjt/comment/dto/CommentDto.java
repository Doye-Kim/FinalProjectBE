package com.ssafy.finalpjt.comment.dto;

import java.time.LocalDateTime;

import com.ssafy.finalpjt.post.dto.PostDto;

import lombok.NoArgsConstructor;


public class CommentDto {

	
	private int commentSeq;
    private String commentContent;
    private LocalDateTime commentTime;
    
    // 외래키
    private int postSeq;
    private int userSeq;
    
    
	public CommentDto(String commentContent, LocalDateTime commentTime, int postSeq, int userSeq) {
		super();
		this.commentContent = commentContent;
		this.commentTime = commentTime;
		this.postSeq = postSeq;
		this.userSeq = userSeq;
	}
	public int getCommentSeq() {
		return commentSeq;
	}
	public void setCommentSeq(int commentSeq) {
		this.commentSeq = commentSeq;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public LocalDateTime getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(LocalDateTime commentTime) {
		this.commentTime = commentTime;
	}
	public int getPostSeq() {
		return postSeq;
	}
	public void setPostSeq(int postSeq) {
		this.postSeq = postSeq;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	@Override
	public String toString() {
		return "CommentDto [commentSeq=" + commentSeq + ", commentContent=" + commentContent + ", commentTime="
				+ commentTime + ", postSeq=" + postSeq + ", userSeq=" + userSeq + "]";
	}

	
    
}
