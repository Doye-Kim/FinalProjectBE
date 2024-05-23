package com.ssafy.finalpjt.like.service;

import com.ssafy.finalpjt.like.dto.LikeDto;

public interface LikeService {
	int toggleLike(LikeDto likeDto); // like-On of like-Off
	int isLiked(int userSeq, int postSeq);
}
