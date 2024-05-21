package com.ssafy.finalpjt.bookmark.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.finalpjt.bookmark.dto.BookmarkDto;

@Mapper
public interface BookmarkDao {
	
	// 북마크 추가
	int insertBookmark(BookmarkDto bookmarkDto);
	
	// 북마크 해제
	int deleteBookmark(@Param("userSeq") int userSeq, @Param("contentId") int contentId);
	
	// 북마크 한 리스트
	List<BookmarkDto> getBookmarksByUser(int userSeq);
	
	// 이미 북마크 했는지 확인
	boolean isBookmarkedByUser(@Param("userSeq") int userSeq, @Param("contentId") int contentId);
	

}
