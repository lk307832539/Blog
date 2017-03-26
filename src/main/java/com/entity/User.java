package com.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String nikeName;
	private String email;
	private String password;
	private Timestamp registerTime;
	private String registerIp;
	private Timestamp lastLoginTime;
	private String lastLoginIp;
	private String loginCount;
	private String validateCode;
	private Short regiestType;
	private Integer score;
	private Set exchangeItems = new HashSet(0);
	private Set dayScoreLogs = new HashSet(0);
	private Set taskTypes = new HashSet(0);
	private Set tasks = new HashSet(0);
	private Set productTypes = new HashSet(0);
	private Set userExts = new HashSet(0);
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userName, String nikeName, String email, String password, Timestamp registerTime,
			String registerIp, Timestamp lastLoginTime, String lastLoginIp, String loginCount, String validateCode,
			Short regiestType, Integer score, Set exchangeItems, Set dayScoreLogs, Set taskTypes, Set tasks,
			Set productTypes, Set userExts, Set products) {
		this.userName = userName;
		this.nikeName = nikeName;
		this.email = email;
		this.password = password;
		this.registerTime = registerTime;
		this.registerIp = registerIp;
		this.lastLoginTime = lastLoginTime;
		this.lastLoginIp = lastLoginIp;
		this.loginCount = loginCount;
		this.validateCode = validateCode;
		this.regiestType = regiestType;
		this.score = score;
		this.exchangeItems = exchangeItems;
		this.dayScoreLogs = dayScoreLogs;
		this.taskTypes = taskTypes;
		this.tasks = tasks;
		this.productTypes = productTypes;
		this.userExts = userExts;
		this.products = products;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNikeName() {
		return this.nikeName;
	}

	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(String loginCount) {
		this.loginCount = loginCount;
	}

	public String getValidateCode() {
		return this.validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public Short getRegiestType() {
		return this.regiestType;
	}

	public void setRegiestType(Short regiestType) {
		this.regiestType = regiestType;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Set getExchangeItems() {
		return this.exchangeItems;
	}

	public void setExchangeItems(Set exchangeItems) {
		this.exchangeItems = exchangeItems;
	}

	public Set getDayScoreLogs() {
		return this.dayScoreLogs;
	}

	public void setDayScoreLogs(Set dayScoreLogs) {
		this.dayScoreLogs = dayScoreLogs;
	}

	public Set getTaskTypes() {
		return this.taskTypes;
	}

	public void setTaskTypes(Set taskTypes) {
		this.taskTypes = taskTypes;
	}

	public Set getTasks() {
		return this.tasks;
	}

	public void setTasks(Set tasks) {
		this.tasks = tasks;
	}

	public Set getProductTypes() {
		return this.productTypes;
	}

	public void setProductTypes(Set productTypes) {
		this.productTypes = productTypes;
	}

	public Set getUserExts() {
		return this.userExts;
	}

	public void setUserExts(Set userExts) {
		this.userExts = userExts;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}