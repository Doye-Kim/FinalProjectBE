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

	private final AttractionDao tripDao;
	@Override
	public List<GugunCodeDto> gugunList(int siCode) {
		return tripDao.gugunList(siCode);
	}

	@Override
	public List<SidoCodeDto> sidoList() {
		return tripDao.sidoList();
	}

	@Override
	public List<PlaceDto> placeList(Map<String, Integer> map) {
		return tripDao.placeList(map);
	}
	
	@Override
    public List<PlaceDto> searchAttraction(String title) {
        return tripDao.searchAttraction(title);
    }

}
