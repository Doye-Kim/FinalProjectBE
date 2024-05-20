package com.ssafy.finalpjt.post.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.post.dto.PostDto;
import com.ssafy.finalpjt.post.service.PostService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PostController {

	
	private final PostService postService;

	// 목록
	@GetMapping("/posts")
	public List<PostDto> postList() {
		List<PostDto> list = postService.postList();
		System.out.println(list);
		return list;
	}

	// 상세
	@GetMapping("/posts/{postSeq}")
	public PostDto postDetail(@PathVariable("postSeq") int postSeq) {
		PostDto dto = postService.postDetail(postSeq);
		System.out.println(dto);
		return dto;
	}

	// 등록
	@PostMapping("/posts")
	public int postInsert(@RequestParam("userSeq") String userSeq, @RequestParam("title") String title, @RequestParam("content") String content ) {
		Map<String, String> map = new HashMap<>();
		map.put("userSeq", userSeq);
		map.put("title", title);
		map.put("content", content);
		return postService.postInsert(map);
	}

	// 수정
	@PutMapping("/posts/{postSeq}")
	public int postUpdate(@PathVariable("postSeq") int postSeq,  @RequestParam("title") String title, @RequestParam("content") String content) {
		PostDto postDto = postService.postDetail(postSeq);
		postDto.setPostTitle(title);
		postDto.setPostContent(content);
		return postService.postUpdate(postDto);
	}

	// 삭제
	@DeleteMapping("posts/{postSeq}")
	public int psotDelete(@PathVariable("postSeq") int postSeq) {
		System.out.println(postSeq);
		return postService.postDelete(postSeq);
	}

}
