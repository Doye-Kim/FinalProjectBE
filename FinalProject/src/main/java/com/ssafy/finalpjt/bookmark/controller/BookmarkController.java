package com.ssafy.finalpjt.bookmark.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.bookmark.dto.BookmarkDto;
import com.ssafy.finalpjt.bookmark.dto.BookmarkResultDto;
import com.ssafy.finalpjt.bookmark.service.BookmarkService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookmarkController {
	
	private final BookmarkService bookmarkService;


    @PostMapping("/bookmarks")
    public int Bookmark(@RequestBody BookmarkDto bookmarkDto) {
    	System.out.println(bookmarkDto);
        return bookmarkService.addBookmark(bookmarkDto);
    }

    @DeleteMapping("/bookmarks/{bookmarkSeq}")
    public int removeBookmark(@RequestBody BookmarkDto bookmarkDto) {
        return bookmarkService.removeBookmark(bookmarkDto);
    }

    @GetMapping("/bookmarks/{userSeq}")
    public List<BookmarkResultDto> getBookmarksByUser(@PathVariable("userSeq") int userSeq) {
        return bookmarkService.getBookmarksByUser(userSeq);
    }
    @GetMapping("/bookmarks/{userSeq}/{contentId}")
    public boolean isBookmarkedByUser(@PathVariable("userSeq") int userSeq, @PathVariable("contentId") int contentId) {
    	Map<String, Integer> map = new HashMap<>();
    	map.put("userSeq", userSeq);
    	map.put("contentId", contentId);
    	if(bookmarkService.isBookmarkedByUser(map) == 1) return true;
    	else return false;
    }

}
