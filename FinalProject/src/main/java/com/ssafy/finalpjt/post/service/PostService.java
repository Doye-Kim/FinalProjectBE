package com.ssafy.finalpjt.post.service;

import java.util.List;

import com.ssafy.finalpjt.comment.dto.CommentDto;
import com.ssafy.finalpjt.post.dto.PostDto;

public interface PostService {
	List<PostDto> postList();
	PostDto postDetail(int postSeq);
	int postInsert(PostDto dto);
	int postUpdate(PostDto dto);
	int postDelete(int postSeq);
	
}
