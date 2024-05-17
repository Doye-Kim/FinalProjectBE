package com.ssafy.finalpjt.auth.service;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.auth.dao.LoginDao;
import com.ssafy.finalpjt.auth.dto.LoginDto;
import com.ssafy.finalpjt.user.dto.UserDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService{
    
    private final LoginDao loginDao;
    
    @Override
    public UserDto login(LoginDto dto) {
    	UserDto userDto = loginDao.login(dto.getUserId());
        if( userDto != null && userDto.getPassword().equals(dto.getPassword())) {
            // password null setting
            userDto.setPassword(null);
            return userDto;
        }else {
            return null;
        }
    }
}
