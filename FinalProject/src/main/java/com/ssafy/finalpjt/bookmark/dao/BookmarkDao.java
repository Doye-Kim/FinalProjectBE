package com.ssafy.finalpjt.bookmark.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.bookmark.dto.BookmarkDto;
import com.ssafy.finalpjt.bookmark.dto.BookmarkResultDto;

@Mapper
public interface BookmarkDao {
	
	// 북마크 추가
	int insertBookmark(BookmarkDto bookmarkDto);
	
	// 북마크 해제
	int deleteBookmark(BookmarkDto bookmarkDto);
	
	// 북마크 한 리스트
	List<BookmarkResultDto> getBookmarksByUser(int userSeq);
	
	// 이미 북마크 했는지 확인
	int isBookmarkedByUser(Map<String, Integer> map);
	

}
