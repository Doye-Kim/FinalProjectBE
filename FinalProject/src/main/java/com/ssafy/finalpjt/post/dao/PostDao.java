package com.ssafy.finalpjt.post.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.post.dto.PostDto;

@Mapper
public interface PostDao {
	
	List<PostDto> postList();
	PostDto postDetail(int postSeq);
	int postInsert(Map<String, String> map);
	int postUpdate(PostDto dto);
	int postDelete(int postSeq);

	// 좋아요 관련 메서드
	void incrementLikeCount(int postSeq);
	void decrementLikeCount(int postSeq);
	
	// 조회수 관련 메서드
	void incrementViewCount(int postSeq);
}
