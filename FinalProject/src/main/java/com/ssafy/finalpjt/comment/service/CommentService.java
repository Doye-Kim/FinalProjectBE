package com.ssafy.finalpjt.comment.service;

import java.util.List;

import com.ssafy.finalpjt.comment.dto.CommentDto;

public interface CommentService {
		//댓글 생성
		int insertComment(CommentDto commentDto);
		
		// 게시글의 댓글 목록 조회
	    List<CommentDto> listComment(int postSeq);
	    
	    // 댓글 수정
//	    void updateComment(CommentDto commentDto);
	    
	    // 댓글 삭제
	    int deleteComment(int commentSeq);
}
