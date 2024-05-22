package com.ssafy.finalpjt.bookmark.service;

import java.util.List;

import com.ssafy.finalpjt.bookmark.dto.BookmarkDto;
import com.ssafy.finalpjt.bookmark.dto.BookmarkResultDto;

public interface BookmarkService {
	int addBookmark(BookmarkDto bookmarkDto);
    int removeBookmark(int bookmarkSeq);
    List<BookmarkResultDto> getBookmarksByUser(int userSeq);
    

}
