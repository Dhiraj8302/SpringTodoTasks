package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int taskId;
	private String taskName;
	private int status;
	public Tasks() {
		super();
	}
	public Tasks(int taskId, String taskName, int status) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.status = status;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
