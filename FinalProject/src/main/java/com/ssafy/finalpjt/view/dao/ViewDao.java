package com.ssafy.finalpjt.view.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.finalpjt.view.dto.ViewDto;

@Mapper
public interface ViewDao {
	int insertView(ViewDto viewDto);
    boolean isViewed(@Param("userSeq") int userSeq, @Param("postSeq") int postSeq);
}
