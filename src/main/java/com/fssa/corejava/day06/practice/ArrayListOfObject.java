package com.fssa.corejava.day06.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOfObject {
	public static void main(String[] args) {

		Task task1 = new Task("Run", 1);
		Task task2 = new Task("Jump", 2);
		Task task3 = new Task("Dance", 3);
		Task find = new Task("Dance", 3);
		Task[] arr = { task1, task2, task3 };
		ArrayList<Task> arrayList = new ArrayList<>(Arrays.asList(arr));

		boolean data = Task.findTaskByName("Run", arrayList);

		System.out.println(data);

	}
}