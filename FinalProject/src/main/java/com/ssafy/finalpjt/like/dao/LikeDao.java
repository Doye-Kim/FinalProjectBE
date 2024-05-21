package com.ssafy.finalpjt.like.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.finalpjt.like.dto.LikeDto;

@Mapper
public interface LikeDao {
	int insertLike(LikeDto likeDto);
    int deleteLike(LikeDto likeDto);
    boolean isLiked(@Param("userSeq") int userSeq, @Param("postSeq") int postSeq); // Like ? or not ?
    
    int getLikeCount(@Param("postSeq") int postSeq);

}
