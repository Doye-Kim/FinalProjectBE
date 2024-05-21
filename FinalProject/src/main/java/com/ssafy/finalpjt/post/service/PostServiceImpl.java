package com.ssafy.finalpjt.post.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.post.dao.PostDao;
import com.ssafy.finalpjt.post.dto.PostDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

	private final PostDao postDao;
	
	@Override
	public List<PostDto> postList() {
		return postDao.postList();
	}

	@Override
	public PostDto postDetail(int postSeq) {
		return postDao.postDetail(postSeq);
	}

	@Override
	public int postInsert(Map<String, String> map) {
		return postDao.postInsert(map);
	}

	@Override
	public int postUpdate(PostDto dto) {
		return postDao.postUpdate(dto);
	}

	@Override
	public int postDelete(int postSeq) {
		return postDao.postDelete(postSeq);
	}
	
	
	// 내가 쓴 글 목록
	@Override
	public List<PostDto> myPostList(int userSeq) {
	    return postDao.myPostList(userSeq);
	}
	
	// 내가 댓글 단 글 목록
	@Override
	public List<PostDto> myCommentedPostList(int userSeq) {
	    return postDao.myCommentedPostList(userSeq);
	}
	
	// 내가 좋아요 누른 글 목록
	@Override
	public List<PostDto> myLikedPostList(int userSeq) {
	    return postDao.myLikedPostList(userSeq);
	}

}
