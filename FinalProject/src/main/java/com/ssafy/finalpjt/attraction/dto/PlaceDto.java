package com.ssafy.finalpjt.attraction.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlaceDto {
	private String title;
	private String addr1;
	private double mapy;
	private double mapx;
	private String firstImage;
	private int contentId;
}
