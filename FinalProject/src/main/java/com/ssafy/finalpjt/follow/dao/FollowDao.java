package com.ssafy.finalpjt.follow.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.follow.dto.FollowDto;

@Mapper
public interface FollowDao {
	int followRegister(Map<String, Integer> map);
	int followDelete(int followSeq);
	List<FollowDto> followList(int userSeq);
}
