package com.ssafy.finalpjt.bookmark.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.bookmark.dto.BookmarkDto;
import com.ssafy.finalpjt.bookmark.service.BookmarkService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookmarkController {
	
	private final BookmarkService bookmarkService;


    @PostMapping("/bookmarks")
    public int addBookmark(@RequestBody BookmarkDto bookmarkDto) {
        return bookmarkService.addBookmark(bookmarkDto);
    }

    @DeleteMapping("/bookmarks/{bookmarkSeq}")
    public int removeBookmark(@PathVariable("bookmarkSeq") int bookmarkSeq) {
        return bookmarkService.removeBookmark(bookmarkSeq);
    }

    @GetMapping("/bookmarks/{userSeq}")
    public List<BookmarkDto> getBookmarksByUser(@PathVariable("userSeq") int userSeq) {
        return bookmarkService.getBookmarksByUser(userSeq);
    }
    

}
