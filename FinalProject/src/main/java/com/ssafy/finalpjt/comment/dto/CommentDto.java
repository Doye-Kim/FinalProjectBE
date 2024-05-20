package com.ssafy.finalpjt.comment.dto;

import java.time.LocalDateTime;


public class CommentDto {

	
	private int commentSeq;
    private String commentContent;
    private LocalDateTime commentTime;
    
    private int userSeq;
    private int postSeq;

    CommentDto(){}
	public CommentDto(int postSeq, String commentContent, LocalDateTime commentTime) {
		super();
		this.postSeq = postSeq;
		this.commentContent = commentContent;
		this.commentTime = commentTime;
		this.postSeq = postSeq;
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

	@Override
	public String toString() {
		return "CommentDto [commentSeq=" + commentSeq + ", commentContent=" + commentContent + ", commentTime="
				+ commentTime + ", postSeq=" + postSeq + "]";
	}
    
	
    
}
