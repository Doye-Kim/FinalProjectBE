package com.ssafy.finalpjt.view.service;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.post.dao.PostDao;
import com.ssafy.finalpjt.view.dao.ViewDao;
import com.ssafy.finalpjt.view.dto.ViewDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ViewServiceImpl implements ViewService{

	private final ViewDao viewDao;
    private final PostDao postDao;


    @Override
    public void incrementViewCount(ViewDto viewDto) {
        int userSeq = viewDto.getUserSeq();
        int postSeq = viewDto.getPostSeq();

        if (!viewDao.isViewed(userSeq, postSeq)) {
            viewDao.insertView(viewDto);
            postDao.incrementViewCount(postSeq);
        }
    }

}
