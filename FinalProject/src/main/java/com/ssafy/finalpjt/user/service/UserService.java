package com.ssafy.finalpjt.user.service;

import com.ssafy.finalpjt.user.dto.UserDto;

public interface UserService {
	UserDto getUser(int userSeq);
	UserDto getUserByPhone(String userPhone);
	int userRegister(UserDto userDto);
	int userUpdate(UserDto userDto);
	int userUpdatePW(UserDto userDto);
	int userDelete(int userSeq);
	String userFindPassword(int userSeq);
}
