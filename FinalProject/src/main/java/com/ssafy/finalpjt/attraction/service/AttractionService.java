package com.ssafy.finalpjt.attraction.service;

import java.util.List;
import java.util.Map;

import com.ssafy.finalpjt.attraction.dto.GugunCodeDto;
import com.ssafy.finalpjt.attraction.dto.PlaceDto;
import com.ssafy.finalpjt.attraction.dto.SidoCodeDto;

public interface AttractionService {
	List<GugunCodeDto> gugunList(int sidoCode);
	List<SidoCodeDto> sidoList();
	List<PlaceDto> placeList(Map<String, Integer> map);
}
