package com.ssafy.finalpjt.attraction.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.finalpjt.attraction.dao.AttractionDao;
import com.ssafy.finalpjt.attraction.dto.GugunCodeDto;
import com.ssafy.finalpjt.attraction.dto.PlaceDto;
import com.ssafy.finalpjt.attraction.dto.SidoCodeDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AttractionServiceImpl implements AttractionService{

	private final AttractionDao attractionDao;
	@Override
	public List<GugunCodeDto> gugunList(int siCode) {
		return attractionDao.gugunList(siCode);
	}

	@Override
	public List<SidoCodeDto> sidoList() {
		return attractionDao.sidoList();
	}

	@Override
	public List<PlaceDto> placeList(Map<String, Integer> map) {
		return attractionDao.placeList(map);
	}
	
	@Override
    public List<PlaceDto> searchAttraction(String title) {
        return attractionDao.searchAttraction(title);
    }

	@Override
	public PlaceDto getPlace(int contentId) {
		return attractionDao.getPlace(contentId);
	}

}
