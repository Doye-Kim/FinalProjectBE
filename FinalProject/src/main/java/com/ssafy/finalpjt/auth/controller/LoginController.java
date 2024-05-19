package com.ssafy.finalpjt.auth.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.auth.dto.LoginDto;
import com.ssafy.finalpjt.auth.service.LoginService;
import com.ssafy.finalpjt.user.dto.UserDto;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService service;
    
    @PostMapping(value="/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginDto dto, HttpSession session){
        System.out.println("login");
    	UserDto userDto = service.login(dto);
    	System.out.println("login controller dto: " + userDto);
        Map<String, String> map = new HashMap<>();
        if( userDto != null ) {
            session.setAttribute("userDto", userDto);
            System.out.println("userDtotototot " + session.getAttribute("userDto"));
            map.put("result", "success");
            map.put("userNickname", userDto.getUserNickname());
            map.put("userSeq", String.valueOf(userDto.getUserSeq()));
            System.out.println(map);
            return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);
        }
        map.put("result", "fail");
        return new ResponseEntity<Map<String, String>>(map, HttpStatus.NOT_FOUND);
    }
    @GetMapping(value="/logout")
    public ResponseEntity<Map<String, String>> login(HttpSession session){
        session.invalidate();
        Map<String, String> map = new HashMap<>();
        map.put("result", "success");
        return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);
    }

}
