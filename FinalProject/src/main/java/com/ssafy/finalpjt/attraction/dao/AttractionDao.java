package com.ssafy.finalpjt.attraction.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.finalpjt.attraction.dto.GugunCodeDto;
import com.ssafy.finalpjt.attraction.dto.PlaceDto;
import com.ssafy.finalpjt.attraction.dto.SidoCodeDto;

@Mapper
public interface AttractionDao {
	List<GugunCodeDto> gugunList(int sidoCode);
	List<SidoCodeDto> sidoList();
	List<PlaceDto> placeList(Map<String, Integer> map);
}

