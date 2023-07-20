package com.fssa.corejava.day09.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task1 {

	int id;
	String name;
	LocalDate deadline;

	public Task1(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Task1 [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	}

	public LocalDate getDeadline() {
		return this.deadline;
	}

}

class DeadlineComparator1 implements Comparator<Task1> {

	@Override
	public int compare(Task1 o1, Task1 o2) {
		// TODO Auto-generated method stub
		return o1.getDeadline().compareTo(o2.getDeadline());
	}
}

public class Practice02 {

	public static void main(String[] args) {

		List<Task1> tasks = new ArrayList<>();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		tasks.add(new Task1(1, "wakeup", LocalDate.parse("2023-03-21", formatter)));
		tasks.add(new Task1(2, "sleep", LocalDate.parse("2023-02-13", formatter)));
		tasks.add(new Task1(3, "eat", LocalDate.parse("2023-12-12", formatter)));

		Collections.sort(tasks, new DeadlineComparator1());

		for (Task1 task : tasks) {
			System.out.println(task);
		}

	}

}
