package com.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Task entity. @author MyEclipse Persistence Tools
 */

public class Task implements java.io.Serializable {

	// Fields

	private Integer taskId;
	private TaskType taskType;
	private User user;
	private Timestamp taskCreateTime;
	private Timestamp taskStartTime;
	private Timestamp taskEndTime;
	private Timestamp taskFinishTime;
	private String taskTitle;
	private Short taskStatus;
	private String taskDescription;
	private Short taskPriority;
	private Short taskIsRepeat;
	private Integer taskRepeatDate;
	private Set taskItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Task() {
	}

	/** minimal constructor */
	public Task(TaskType taskType, User user) {
		this.taskType = taskType;
		this.user = user;
	}

	/** full constructor */
	public Task(TaskType taskType, User user, Timestamp taskCreateTime, Timestamp taskStartTime, Timestamp taskEndTime,
			Timestamp taskFinishTime, String taskTitle, Short taskStatus, String taskDescription, Short taskPriority,
			Short taskIsRepeat, Integer taskRepeatDate, Set taskItems) {
		this.taskType = taskType;
		this.user = user;
		this.taskCreateTime = taskCreateTime;
		this.taskStartTime = taskStartTime;
		this.taskEndTime = taskEndTime;
		this.taskFinishTime = taskFinishTime;
		this.taskTitle = taskTitle;
		this.taskStatus = taskStatus;
		this.taskDescription = taskDescription;
		this.taskPriority = taskPriority;
		this.taskIsRepeat = taskIsRepeat;
		this.taskRepeatDate = taskRepeatDate;
		this.taskItems = taskItems;
	}

	// Property accessors

	public Integer getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public TaskType getTaskType() {
		return this.taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getTaskCreateTime() {
		return this.taskCreateTime;
	}

	public void setTaskCreateTime(Timestamp taskCreateTime) {
		this.taskCreateTime = taskCreateTime;
	}

	public Timestamp getTaskStartTime() {
		return this.taskStartTime;
	}

	public void setTaskStartTime(Timestamp taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public Timestamp getTaskEndTime() {
		return this.taskEndTime;
	}

	public void setTaskEndTime(Timestamp taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	public Timestamp getTaskFinishTime() {
		return this.taskFinishTime;
	}

	public void setTaskFinishTime(Timestamp taskFinishTime) {
		this.taskFinishTime = taskFinishTime;
	}

	public String getTaskTitle() {
		return this.taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public Short getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(Short taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskDescription() {
		return this.taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Short getTaskPriority() {
		return this.taskPriority;
	}

	public void setTaskPriority(Short taskPriority) {
		this.taskPriority = taskPriority;
	}

	public Short getTaskIsRepeat() {
		return this.taskIsRepeat;
	}

	public void setTaskIsRepeat(Short taskIsRepeat) {
		this.taskIsRepeat = taskIsRepeat;
	}

	public Integer getTaskRepeatDate() {
		return this.taskRepeatDate;
	}

	public void setTaskRepeatDate(Integer taskRepeatDate) {
		this.taskRepeatDate = taskRepeatDate;
	}

	public Set getTaskItems() {
		return this.taskItems;
	}

	public void setTaskItems(Set taskItems) {
		this.taskItems = taskItems;
	}

}