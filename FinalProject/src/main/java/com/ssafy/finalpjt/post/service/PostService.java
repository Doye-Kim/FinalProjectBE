package com.ssafy.finalpjt.post.service;

import java.util.List;
import java.util.Map;

import com.ssafy.finalpjt.post.dto.PostDto;

public interface PostService {
	List<PostDto> postList();
	PostDto postDetail(int postSeq);
	int postInsert(Map<String, String> map);
	int postUpdate(PostDto dto);
	int postDelete(int postSeq);
	
}
