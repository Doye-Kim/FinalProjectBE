package com.ssafy.finalpjt.like.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.like.dao.LikeDao;
import com.ssafy.finalpjt.like.dto.LikeDto;
import com.ssafy.finalpjt.post.dao.PostDao;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LikeServiceImpl implements LikeService{

	private final LikeDao likeDao;
	private final PostDao postDao;
	
	@Override
	public int toggleLike(LikeDto likeDto) {
		int userSeq = likeDto.getUserSeq();
        int postSeq = likeDto.getPostSeq();
        Map<String, Integer> map = new HashMap<>();
		map.put("userSeq", userSeq);
		map.put("postSeq", postSeq);
        if (likeDao.isLiked(map) == 1) {
        	System.out.println("삭제하겠습ㄴ;디");
            likeDao.deleteLike(likeDto);
            postDao.decrementLikeCount(postSeq);
        } else {
        	System.out.println("추가합니다");
            likeDao.insertLike(likeDto);
            postDao.incrementLikeCount(postSeq);
        }
        
        return likeDao.getLikeCount(postSeq);
	}

	@Override
	public int isLiked(int userSeq, int postSeq) {
		Map<String, Integer> map = new HashMap<>();
		map.put("userSeq", userSeq);
		map.put("postSeq", postSeq);
		System.out.println(userSeq + " " + postSeq);
		System.out.println(likeDao.isLiked(map));
		return likeDao.isLiked(map);
	}

}
