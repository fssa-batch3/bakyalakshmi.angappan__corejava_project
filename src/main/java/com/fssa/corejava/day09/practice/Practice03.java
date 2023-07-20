package com.fssa.corejava.day09.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task {

	int id;
	String name;
	LocalDate deadline;
	int priority;

	public Task(int id, String name, LocalDate deadline, int priority) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + ", priority=" + priority + "]";
	}

	public LocalDate getDeadline() {
		return this.deadline;
	}

	public int getPriority() {
		return this.priority;
	}

}

class DeadlineComparator implements Comparator<Task> {
	@Override
	public int compare(Task t1, Task t2) {
		return t1.getDeadline().compareTo(t2.getDeadline());
	}
}

class DeadlineAndPriorityComparator implements Comparator<Task> {
	@Override
	public int compare(Task t1, Task t2) {
		int priorityComparison = Integer.compare(t1.getPriority(), t2.getPriority());
		if (priorityComparison != 0) {
			return priorityComparison;
		}
		return t1.getDeadline().compareTo(t2.getDeadline());
	}
}

public class Practice03 {

	public static void main(String[] args) {

		List<Task> tasks = new ArrayList<>();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		tasks.add(new Task(1, "wakeup", LocalDate.parse("2023-03-21", formatter), 1));
		tasks.add(new Task(2, "sleep", LocalDate.parse("2023-02-13", formatter), 2));
		tasks.add(new Task(3, "eat", LocalDate.parse("2023-12-12", formatter), 3));

		Collections.sort(tasks, new DeadlineAndPriorityComparator());

		for (Task task : tasks) {
			System.out.println(task);
		}

	}

}
