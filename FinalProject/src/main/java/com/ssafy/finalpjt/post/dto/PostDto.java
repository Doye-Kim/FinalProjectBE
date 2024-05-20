package com.ssafy.finalpjt.post.dto;

import java.time.LocalDate;
import java.util.List;

import com.ssafy.finalpjt.comment.dto.CommentDto;

public class PostDto {

	private int postSeq;
	private String postTitle;
	private String postContent;
	private LocalDate postTime;
	private LocalDate updateDate;
	private int likeCount;
	private int viewCount;

	private List<CommentDto> comment;

	public PostDto() {
	}

	public PostDto(String postTitle, String postContent, LocalDate postTime, LocalDate updateDate, int likeCount,
			int viewCount, List<CommentDto> comment) {
		super();
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.postTime = postTime;
		this.updateDate = updateDate;
		this.likeCount = likeCount;
		this.viewCount = viewCount;
		this.comment = comment;
	}

	public int getPostSeq() {
		return postSeq;
	}

	public void setPostSeq(int postSeq) {
		this.postSeq = postSeq;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public LocalDate getPostTime() {
		return postTime;
	}

	public void setPostTime(LocalDate postTime) {
		this.postTime = postTime;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public List<CommentDto> getComment() {
		return comment;
	}

	public void setComment(List<CommentDto> comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "PostDto [postSeq=" + postSeq + ", postTitle=" + postTitle + ", postContent=" + postContent
				+ ", postTime=" + postTime + ", updateDate=" + updateDate + ", likeCount=" + likeCount + ", viewCount="
				+ viewCount + ", comment=" + comment + "]";
	}

}
