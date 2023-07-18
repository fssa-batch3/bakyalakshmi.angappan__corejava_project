package com.fssa.corejava.day06.practice;

import java.util.ArrayList;

public class Task {
	public String taskName;
	public int priority;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (Task task : tasks) {
			if (task.getTaskName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
