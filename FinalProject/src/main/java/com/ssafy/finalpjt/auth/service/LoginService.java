package com.ssafy.finalpjt.auth.service;

import com.ssafy.finalpjt.auth.dto.LoginDto;
import com.ssafy.finalpjt.user.dto.UserDto;

public interface LoginService {
	UserDto login(LoginDto dto);
}
