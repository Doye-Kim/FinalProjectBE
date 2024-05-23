package com.ssafy.finalpjt.like.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.finalpjt.like.dto.LikeDto;

@Mapper
public interface LikeDao {
	int insertLike(LikeDto likeDto);
    int deleteLike(LikeDto likeDto);
    int isLiked(Map<String, Integer> map); // Like ? or not ?
    
    int getLikeCount(@Param("postSeq") int postSeq);

}
