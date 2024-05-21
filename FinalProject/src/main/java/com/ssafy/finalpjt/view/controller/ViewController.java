package com.ssafy.finalpjt.view.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.view.dto.ViewDto;
import com.ssafy.finalpjt.view.service.ViewService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ViewController {
	private final ViewService viewService;

    @PostMapping("/posts/{postSeq}/view")
    public void incrementViewCount(@PathVariable("postSeq") int postSeq, @RequestBody ViewDto viewDto) {
        viewDto.setPostSeq(postSeq);
        viewService.incrementViewCount(viewDto);
    }
}
