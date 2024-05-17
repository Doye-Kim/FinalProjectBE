package com.ssafy.finalpjt.auth.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.user.dto.UserDto;

@Mapper
public interface LoginDao {
	UserDto login(String userId);
}
