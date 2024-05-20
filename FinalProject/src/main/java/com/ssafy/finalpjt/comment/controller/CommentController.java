package com.ssafy.finalpjt.comment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.comment.dto.CommentDto;
import com.ssafy.finalpjt.comment.service.CommentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CommentController {
	
	private final CommentService commentService;

    @GetMapping("/posts/{postSeq}/comments")
    public List<CommentDto> getCommentsByPostSeq(@PathVariable int postSeq) {
        return commentService.getCommentsByPostSeq(postSeq);
    }

    @PostMapping("/posts/{postSeq}/comments")
    public int insertComment(@PathVariable int postSeq, @RequestBody CommentDto commentDto) {
        commentDto.setPostSeq(postSeq);
        return commentService.insertComment(commentDto);
    }

//    @PutMapping("/comments/{commentSeq}")
//    public int updateComment(@PathVariable int commentSeq, @RequestBody CommentDto commentDto) {
//        commentDto.setCommentSeq(commentSeq);
//        return commentService.updateComment(commentDto);
//    }

    @DeleteMapping("/comments/{commentSeq}")
    public int deleteComment(@PathVariable int commentSeq) {
        return commentService.deleteComment(commentSeq);
    }
}
