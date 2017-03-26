package com.entity;

import java.sql.Timestamp;

/**
 * DayScoreLog entity. @author MyEclipse Persistence Tools
 */

public class DayScoreLog implements java.io.Serializable {

	// Fields

	private Integer scoreLogId;
	private User user;
	private Integer totleScore;
	private Integer addScore;
	private Integer cutScore;
	private Timestamp scoreLogDate;

	// Constructors

	/** default constructor */
	public DayScoreLog() {
	}

	/** minimal constructor */
	public DayScoreLog(User user) {
		this.user = user;
	}

	/** full constructor */
	public DayScoreLog(User user, Integer totleScore, Integer addScore, Integer cutScore, Timestamp scoreLogDate) {
		this.user = user;
		this.totleScore = totleScore;
		this.addScore = addScore;
		this.cutScore = cutScore;
		this.scoreLogDate = scoreLogDate;
	}

	// Property accessors

	public Integer getScoreLogId() {
		return this.scoreLogId;
	}

	public void setScoreLogId(Integer scoreLogId) {
		this.scoreLogId = scoreLogId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getTotleScore() {
		return this.totleScore;
	}

	public void setTotleScore(Integer totleScore) {
		this.totleScore = totleScore;
	}

	public Integer getAddScore() {
		return this.addScore;
	}

	public void setAddScore(Integer addScore) {
		this.addScore = addScore;
	}

	public Integer getCutScore() {
		return this.cutScore;
	}

	public void setCutScore(Integer cutScore) {
		this.cutScore = cutScore;
	}

	public Timestamp getScoreLogDate() {
		return this.scoreLogDate;
	}

	public void setScoreLogDate(Timestamp scoreLogDate) {
		this.scoreLogDate = scoreLogDate;
	}

}