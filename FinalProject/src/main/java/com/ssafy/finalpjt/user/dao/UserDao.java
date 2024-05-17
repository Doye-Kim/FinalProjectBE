package com.ssafy.finalpjt.user.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.user.dto.UserDto;

@Mapper
public interface UserDao {
	UserDto getUser(int userSeq);
	int userRegister(UserDto userDto);
	int userUpdate(UserDto userDto);
	int userUpdatePW(UserDto userDto);
	int userDelete(int userSeq);
	String userFindPassword(int userSeq);
}