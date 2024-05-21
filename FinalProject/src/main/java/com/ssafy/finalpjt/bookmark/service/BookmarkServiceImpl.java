package com.ssafy.finalpjt.bookmark.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.bookmark.dao.BookmarkDao;
import com.ssafy.finalpjt.bookmark.dto.BookmarkDto;

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
            return bookmarkDao.insertBookmark(bookmarkDto);
        }
        return 0;
    }

    @Override
    public int removeBookmark(int userSeq, int contentId) {
        return bookmarkDao.deleteBookmark(userSeq, contentId);
    }

    @Override
    public List<BookmarkDto> getBookmarksByUser(int userSeq) {
        return bookmarkDao.getBookmarksByUser(userSeq);
    }


}
