package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TaskType entity. @author MyEclipse Persistence Tools
 */

public class TaskType implements java.io.Serializable {

	// Fields

	private Integer taskTypeId;
	private User user;
	private String taskTypeName;
	private Integer taskTypeScore;
	private Short taskTypePriority;
	private Short taskTypeIsEnabled;
	private String taskTypeImg;
	private Set tasks = new HashSet(0);

	// Constructors

	/** default constructor */
	public TaskType() {
	}

	/** minimal constructor */
	public TaskType(User user) {
		this.user = user;
	}

	/** full constructor */
	public TaskType(User user, String taskTypeName, Integer taskTypeScore, Short taskTypePriority,
			Short taskTypeIsEnabled, String taskTypeImg, Set tasks) {
		this.user = user;
		this.taskTypeName = taskTypeName;
		this.taskTypeScore = taskTypeScore;
		this.taskTypePriority = taskTypePriority;
		this.taskTypeIsEnabled = taskTypeIsEnabled;
		this.taskTypeImg = taskTypeImg;
		this.tasks = tasks;
	}

	// Property accessors

	public Integer getTaskTypeId() {
		return this.taskTypeId;
	}

	public void setTaskTypeId(Integer taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTaskTypeName() {
		return this.taskTypeName;
	}

	public void setTaskTypeName(String taskTypeName) {
		this.taskTypeName = taskTypeName;
	}

	public Integer getTaskTypeScore() {
		return this.taskTypeScore;
	}

	public void setTaskTypeScore(Integer taskTypeScore) {
		this.taskTypeScore = taskTypeScore;
	}

	public Short getTaskTypePriority() {
		return this.taskTypePriority;
	}

	public void setTaskTypePriority(Short taskTypePriority) {
		this.taskTypePriority = taskTypePriority;
	}

	public Short getTaskTypeIsEnabled() {
		return this.taskTypeIsEnabled;
	}

	public void setTaskTypeIsEnabled(Short taskTypeIsEnabled) {
		this.taskTypeIsEnabled = taskTypeIsEnabled;
	}

	public String getTaskTypeImg() {
		return this.taskTypeImg;
	}

	public void setTaskTypeImg(String taskTypeImg) {
		this.taskTypeImg = taskTypeImg;
	}

	public Set getTasks() {
		return this.tasks;
	}

	public void setTasks(Set tasks) {
		this.tasks = tasks;
	}

}