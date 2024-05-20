package com.ssafy.finalpjt.post.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.post.dto.PostDto;

@Mapper
public interface PostDao {
	List<PostDto> postList();
	PostDto postDetail(int postSeq);
	int postInsert(PostDto dto);
	int postUpdate(PostDto dto);
	int postDelete(int postSeq);
}