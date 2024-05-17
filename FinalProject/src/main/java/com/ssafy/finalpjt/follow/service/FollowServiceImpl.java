package com.ssafy.finalpjt.follow.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.follow.dao.FollowDao;
import com.ssafy.finalpjt.follow.dto.FollowDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FollowServiceImpl implements FollowService{
	private final FollowDao followDao;
	@Override
	public int followRegister(Map<String, Integer> map) {
		return followDao.followRegister(map);
	}

	@Override
	public int followDelete(int followSeq) {
		return followDao.followDelete(followSeq);
	}

	@Override
	public List<FollowDto> followList(int userSeq) {
		return followDao.followList(userSeq);
	}

}
