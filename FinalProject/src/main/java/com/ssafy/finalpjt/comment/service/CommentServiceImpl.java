package com.ssafy.finalpjt.comment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.comment.dao.CommentDao;
import com.ssafy.finalpjt.comment.dto.CommentDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService{
	private final CommentDao commentDao;

    @Override
    public List<CommentDto> getCommentsByPostSeq(int postSeq) {
        return commentDao.getCommentsByPostSeq(postSeq);
    }

    @Override
    public int insertComment(CommentDto commentDto) {
        return commentDao.insertComment(commentDto);
    }

//    @Override
//    public int updateComment(CommentDto commentDto) {
//        return commentDao.updateComment(commentDto);
//    }

    @Override
    public int deleteComment(int commentSeq) {
        return commentDao.deleteComment(commentSeq);
    }

}
