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

	// 내가 쓴 글 목록
	List<PostDto> myPostList(int userSeq);

	// 내가 댓글 단 글 목록
	List<PostDto> myCommentedPostList(int userSeq);

	// 내가 좋아요 누른 글 목록
	List<PostDto> myLikedPostList(int userSeq);

}
