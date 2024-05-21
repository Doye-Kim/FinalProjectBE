package com.ssafy.finalpjt.attraction.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.finalpjt.attraction.dto.GugunCodeDto;
import com.ssafy.finalpjt.attraction.dto.PlaceDto;
import com.ssafy.finalpjt.attraction.dto.SidoCodeDto;
import com.ssafy.finalpjt.attraction.service.AttractionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/attraction")
public class AttractionController {
	private final AttractionService attractionService;

	@GetMapping("/sido")
	public List<SidoCodeDto> sidoCodeList(){
		List<SidoCodeDto> list = attractionService.sidoList();
		return list;
	}
	@GetMapping("/gugun/{sidoCode}")
	public List<GugunCodeDto> gugunCodeList(@PathVariable("sidoCode") int sidoCode){
		List<GugunCodeDto> list = attractionService.gugunList(sidoCode);
		return list;
	}
	@GetMapping("/place")
	public List<PlaceDto> placeList(@RequestParam("contentTypeId") int contentTypeId, @RequestParam("sidoCode") int sidoCode, @RequestParam("gugunCode") int gugunCode){
		Map<String, Integer> map = new HashMap<>();
		map.put("contentTypeId", contentTypeId);
		map.put("sidoCode", sidoCode);
		map.put("gugunCode", gugunCode);
		List<PlaceDto> list = attractionService.placeList(map);
		return list;
	}
	
	// 관광지 검색
	@GetMapping("/search")
    public List<PlaceDto> searchAttraction(@RequestParam("title") String title) {
        return attractionService.searchAttraction(title);
    }
}