package com.ssafy.finalpjt.bookmark.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.bookmark.dao.BookmarkDao;
import com.ssafy.finalpjt.bookmark.dto.BookmarkDto;
import com.ssafy.finalpjt.bookmark.dto.BookmarkResultDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookmarkServiceImpl implements BookmarkService{

	private final BookmarkDao bookmarkDao;

    @Override
    public int addBookmark(BookmarkDto bookmarkDto) {
        int userSeq = bookmarkDto.getUserSeq();
        int contentId = bookmarkDto.getContentId();

        if (!bookmarkDao.isBookmarkedByUser(userSeq, contentId)) {
        	System.out.println("등록 가능 ");
            return bookmarkDao.insertBookmark(bookmarkDto);
        }
        else {
        	System.out.println("등록 불가능 " + bookmarkDto.getBookmarkSeq());
        	return bookmarkDao.deleteBookmark(bookmarkDto);
        }
    }

    @Override
    public int removeBookmark(BookmarkDto bookmarkDto) {
        return bookmarkDao.deleteBookmark(bookmarkDto);
    }

    @Override
    public List<BookmarkResultDto> getBookmarksByUser(int userSeq) {
        return bookmarkDao.getBookmarksByUser(userSeq);
    }


}
