package com.ssafy.finalpjt.comment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.comment.dto.CommentDto;
import com.ssafy.finalpjt.comment.service.CommentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CommentController {
	
	private final CommentService commentService;

    @GetMapping("/posts/{postSeq}/comments")
    public List<CommentDto> listComment(@PathVariable("postSeq") int postSeq) {
        return commentService.listComment(postSeq);
    }

    @PostMapping("/posts/{postSeq}/comments")
    public int insertComment(@PathVariable("postSeq") int postSeq, @RequestParam("userSeq") int userSeq,  @RequestParam("commentContent") String commentContent) {
        System.out.println(postSeq);
        System.out.println(commentContent);
    	CommentDto commentDto = new CommentDto();
        commentDto.setPostSeq(postSeq);
        commentDto.setUserSeq(userSeq);
        commentDto.setCommentContent(commentContent);
        return commentService.insertComment(commentDto);
    }

//    @PutMapping("/comments/{commentSeq}")
//    public int updateComment(@PathVariable int commentSeq, @RequestBody CommentDto commentDto) {
//        commentDto.setCommentSeq(commentSeq);
//        return commentService.updateComment(commentDto);
//    }

    @DeleteMapping("posts/comments/{commentSeq}")
    public int deleteComment(@PathVariable("commentSeq") int commentSeq) {
        return commentService.deleteComment(commentSeq);
    }
}
