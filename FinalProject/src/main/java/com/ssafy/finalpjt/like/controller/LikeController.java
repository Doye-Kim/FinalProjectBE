package com.ssafy.finalpjt.like.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.like.dto.LikeDto;
import com.ssafy.finalpjt.like.service.LikeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class LikeController {
	
	private final LikeService likeService;

    @PostMapping("/posts/{postSeq}/like")
    public int toggleLike(@PathVariable("postSeq") int postSeq, @RequestBody LikeDto likeDto) {
    	likeDto.setPostSeq(postSeq);
        return likeService.toggleLike(likeDto);
    }
    
    @GetMapping("/posts/{postSeq}/{userSeq}/like")
    public boolean isLiked(@PathVariable("postSeq") int postSeq, @PathVariable("userSeq") int userSeq) {
    	if(likeService.isLiked(userSeq, postSeq) == 1) return true;
    	else return false;
    }

}
