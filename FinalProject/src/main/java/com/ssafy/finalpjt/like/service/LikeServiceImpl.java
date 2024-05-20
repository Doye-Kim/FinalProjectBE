package com.ssafy.finalpjt.like.service;

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

        if (likeDao.isLiked(userSeq, postSeq)) {
            likeDao.deleteLike(likeDto);
            postDao.decrementLikeCount(postSeq);
        } else {
            likeDao.insertLike(likeDto);
            postDao.incrementLikeCount(postSeq);
        }
        
        return likeDao.getLikeCount(postSeq);
	}

}
