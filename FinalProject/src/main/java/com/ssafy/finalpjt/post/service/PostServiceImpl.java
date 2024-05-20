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
	
	

}
