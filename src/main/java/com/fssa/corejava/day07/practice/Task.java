package com.fssa.corejava.day07.practice;

import java.time.LocalDate;

public class Task {

	private int id;
	private String name;
	private LocalDate deadline;

	public Task(String name, LocalDate deadline) {
		this.name = name;
		this.deadline = deadline;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deadline == null) ? 0 : deadline.hashCode());

		result = prime * result + ((name == null) ? 0 : name.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Task other = (Task) obj;
		
		if (deadline == null) {
			if (other.deadline != null)
				return false;
		} else if (!deadline.equals(other.deadline))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Task [ name=" + name + ", deadline=" + deadline + "]";
	}

}
