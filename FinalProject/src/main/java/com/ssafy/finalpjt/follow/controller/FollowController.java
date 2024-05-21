package com.ssafy.finalpjt.follow.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.follow.dto.FollowDto;
import com.ssafy.finalpjt.follow.service.FollowService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class FollowController {
	private final FollowService followService;
	
	@PostMapping("/follows")
	public int register(@RequestParam("fromSeq") int fromSeq, @RequestParam("toSeq") int toSeq) {
		Map<String, Integer> map = new HashMap<>();
		map.put("fromSeq", fromSeq);
		map.put("toSeq", toSeq);
		return followService.followRegister(map);	
	}
	
	@DeleteMapping("/follows")
	public int delete(@RequestParam("followSeq") int followSeq) {
		return followService.followDelete(followSeq);
	}
	
	@GetMapping("/follows/{fromSeq}")
	public List<FollowDto> get(@PathVariable("fromSeq") int fromSeq) {
		return followService.followList(fromSeq);
	}
}
