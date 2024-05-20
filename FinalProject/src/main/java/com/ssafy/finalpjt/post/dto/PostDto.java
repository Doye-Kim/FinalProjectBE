package com.ssafy.finalpjt.post.dto;

import java.time.LocalDate;
import java.util.List;

import com.ssafy.finalpjt.comment.dto.CommentDto;

public class PostDto {

	private int postSeq;
	private String postTitle;
	private String postContent;
	private LocalDate postTime;
	private LocalDate updateTime;
	private int likeCount;
	private int viewCount;
	
	//외래키
	private int userSeq;



	public PostDto(String postTitle, String postContent, LocalDate postTime, LocalDate updateTime, int likeCount,
			int viewCount, int userSeq, List<CommentDto> comment) {
		super();
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.postTime = postTime;
		this.updateTime = updateTime;
		this.likeCount = likeCount;
		this.viewCount = viewCount;
		this.userSeq = userSeq;

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

	public LocalDate getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDate updateTime) {
		this.updateTime = updateTime;
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

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}



	@Override
	public String toString() {
		return "PostDto [postSeq=" + postSeq + ", postTitle=" + postTitle + ", postContent=" + postContent
				+ ", postTime=" + postTime + ", updateTime=" + updateTime + ", likeCount=" + likeCount + ", viewCount="
				+ viewCount + ", userSeq=" + userSeq + "]";
	}

	
}
