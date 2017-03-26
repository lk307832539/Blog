package com.entity;

import java.util.Date;

/**
 * UserExt entity. @author MyEclipse Persistence Tools
 */

public class UserExt implements java.io.Serializable {

	// Fields

	private Integer userExtId;
	private User user;
	private String userImg;
	private String nickName;
	private String realName;
	private Date birthday;
	private String sex;
	private String wechat;
	private String qq;
	private String address;
	private String profession;
	private String intro;

	// Constructors

	/** default constructor */
	public UserExt() {
	}

	/** minimal constructor */
	public UserExt(User user) {
		this.user = user;
	}

	/** full constructor */
	public UserExt(User user, String userImg, String nickName, String realName, Date birthday, String sex,
			String wechat, String qq, String address, String profession, String intro) {
		this.user = user;
		this.userImg = userImg;
		this.nickName = nickName;
		this.realName = realName;
		this.birthday = birthday;
		this.sex = sex;
		this.wechat = wechat;
		this.qq = qq;
		this.address = address;
		this.profession = profession;
		this.intro = intro;
	}

	// Property accessors

	public Integer getUserExtId() {
		return this.userExtId;
	}

	public void setUserExtId(Integer userExtId) {
		this.userExtId = userExtId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserImg() {
		return this.userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

}