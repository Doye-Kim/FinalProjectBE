package com.ssafy.finalpjt.user.service;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.user.dao.UserDao;
import com.ssafy.finalpjt.user.dto.UserDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

	private final UserDao userDao;
	@Override
	public int userRegister(UserDto userDto) {
		return userDao.userRegister(userDto);
	}

	@Override
	public int userUpdate(UserDto userDto) {
		return userDao.userUpdate(userDto);
	}
	@Override
	public int userUpdatePW(UserDto userDto) {
		return userDao.userUpdatePW(userDto);
	}

	@Override
	public UserDto getUser(int userSeq) {
		return userDao.getUser(userSeq);
	}

	@Override
	public int userDelete(int userSeq) {
		return userDao.userDelete(userSeq);
	}

	@Override
	public String userFindPassword(int userSeq) {
		return userDao.userFindPassword(userSeq);
	}

	@Override
	public UserDto getUserByPhone(String userPhone) {
		return userDao.getUserByPhone(userPhone);
	}

}
