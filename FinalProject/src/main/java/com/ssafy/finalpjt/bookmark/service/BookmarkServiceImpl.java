package com.ssafy.finalpjt.bookmark.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<String, Integer> map = new HashMap<>();
    	map.put("userSeq", userSeq);
    	map.put("contentId", contentId);
        if (bookmarkDao.isBookmarkedByUser(map) == 0) {
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

	@Override
	public int isBookmarkedByUser(Map<String, Integer> map) {
		return bookmarkDao.isBookmarkedByUser(map);
	}


}
