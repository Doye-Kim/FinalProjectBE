package com.ssafy.finalpjt.post.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.post.dto.PostDto;

@Mapper
public interface PostDao {
	
	List<PostDto> postList(int offset);
	PostDto postDetail(int postSeq);
	int postInsert(Map<String, String> map);
	int postUpdate(PostDto dto);
	int postDelete(int postSeq);
	int getTotalCount();
	// 내가 쓴 글 목록
	List<PostDto> myPostList(int userSeq);
	
	// 내가 댓글 단 글 목록
	List<PostDto> myCommentedPostList(int userSeq);
	
	// 내가 좋아요 누른 글 목록
	List<PostDto> myLikedPostList(int userSeq);

	// 좋아요 관련 메서드
	void incrementLikeCount(int postSeq);
	void decrementLikeCount(int postSeq);
	
	// 조회수 관련 메서드
	void incrementViewCount(int postSeq);
}
