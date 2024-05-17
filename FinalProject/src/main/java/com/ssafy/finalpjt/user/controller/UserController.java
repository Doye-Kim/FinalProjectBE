package com.ssafy.finalpjt.user.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.user.dto.UserDto;
import com.ssafy.finalpjt.user.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	private final UserService userService;
	
	@PostMapping("/users")
	public int userRegister(@RequestBody UserDto userDto) {
		System.out.println(userDto);
		return userService.userRegister(userDto);
	}
	@PutMapping("/users/{userSeq}")
	public int userUpdate(@PathVariable("userSeq") int userSeq, @RequestParam("userNickname") String userNickname, @RequestParam("userPhone") String userPhone, @RequestParam("allowSearchByPhone") int allowSearchByPhone) {
		UserDto userDto = userService.getUser(userSeq);
		userDto.setUserNickname(userNickname);
		userDto.setUserPhone(userPhone);
		userDto.setAllowSearchByPhone(allowSearchByPhone);
		return userService.userUpdate(userDto);
	}
	@PutMapping("/users/{userSeq}/password")
	public int userUpdatePW(@PathVariable("userSeq") int userSeq, @RequestParam("password") String password) {
		UserDto userDto = userService.getUser(userSeq);
		userDto.setPassword(password);
		return userService.userUpdatePW(userDto);
	}
	@PostMapping("/users/{userSeq}")
	public int UserDelete(@PathVariable("userSeq") int userSeq) {
		return userService.userDelete(userSeq);
	}
	@GetMapping("/users/{userSeq}")
	public UserDto getUser(@PathVariable("userSeq") int userSeq) {
		return userService.getUser(userSeq);
	}
	@GetMapping("/users/{userSeq}/password")
	public String UserFindPassword(@PathVariable("userSeq") int userSeq) {
		return userService.userFindPassword(userSeq);
	}
}
