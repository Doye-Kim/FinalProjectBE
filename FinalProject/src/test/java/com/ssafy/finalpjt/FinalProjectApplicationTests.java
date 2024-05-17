package com.ssafy.finalpjt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.finalpjt.user.dto.UserDto;
import com.ssafy.finalpjt.user.service.UserService;

@SpringBootTest
@AutoConfigureMockMvc
class FinalProjectApplicationTests {

	@Autowired
	UserService userService;
	
	@Test
	@Transactional
	@DisplayName("회원 수정 테스트")
	void userUpdate() {
		UserDto dto = new UserDto(1, "싸피", "", "010-1231-1234", "", "ssafy", 1, 0);
		assertEquals(1, userService.userUpdate(dto));
	}
	@Test
	@Transactional
	@DisplayName("회원 비밀번호 수정 테스트")
	void userUpdatePW() {
		//UserDto dto = new UserDto(1, "싸피", "1235", "010-1231-1234", "users", "ssafy", 1, 0);
		assertEquals(1, userService.userDelete(8));
	}
	
	@Test
	@Transactional
	@DisplayName("회원 비밀번호 찾기 테스트")
	void userSearchPW() {
		UserDto dto = userService.getUser(7);
		assertEquals(dto.getPassword(), userService.userFindPassword(7));
	}

	@Test
	@Transactional
	@DisplayName("회원 탈퇴 테스트")
	void userDelete() {
		assertEquals(1, userService.userDelete(7));
	}
	
	@Test
	@Transactional
	@DisplayName("회원 조회 테스트")
	void getUser() {
		UserDto dto = userService.getUser(7);
		assertEquals(dto, userService.getUser(7));
	}
}
