package com.ssafy.finalpjt.bookmark.service;

import java.util.List;

import com.ssafy.finalpjt.bookmark.dto.BookmarkDto;

public interface BookmarkService {
	int addBookmark(BookmarkDto bookmarkDto);
    int removeBookmark(int bookmarkSeq);
    List<BookmarkDto> getBookmarksByUser(int userSeq);
    

}
