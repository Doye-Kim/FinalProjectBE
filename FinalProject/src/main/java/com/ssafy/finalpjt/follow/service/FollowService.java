package com.ssafy.finalpjt.follow.service;

import java.util.List;
import java.util.Map;

import com.ssafy.finalpjt.follow.dto.FollowDto;

public interface FollowService {
	int followRegister(Map<String, Integer> map);
	int followDelete(int followSeq);
	List<FollowDto> followList(int userSeq);
}
