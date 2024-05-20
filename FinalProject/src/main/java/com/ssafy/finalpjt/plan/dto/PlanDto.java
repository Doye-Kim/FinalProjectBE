package com.ssafy.finalpjt.plan.dto;

import java.time.LocalDate;

public class PlanDto {

	private int planSeq;
	private String planDate;
	
	private int contentId; // 관광지 Id
	private int userSeq; // 유저 seq
	public PlanDto(String planDate, int contentId, int userSeq) {
		super();
		this.planDate = planDate;
		this.contentId = contentId;
		this.userSeq = userSeq;
	}
	public int getPlanSeq() {
		return planSeq;
	}
	public void setPlanSeq(int planSeq) {
		this.planSeq = planSeq;
	}
	public String getPlanDate() {
		return planDate;
	}
	public void setPlanDate(String planDate) {
		this.planDate = planDate;
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	@Override
	public String toString() {
		return "PlanDto [planSeq=" + planSeq + ", planDate=" + planDate + ", contentId=" + contentId + ", userSeq="
				+ userSeq + "]";
	}
	
	
	
}
