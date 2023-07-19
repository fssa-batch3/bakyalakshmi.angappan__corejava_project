package com.fssa.corejava.day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.of(2020, 1, 8);

		Task task1 = new Task("wakeup", date);
		Task task2 = new Task("wakeup", date);
		Task task3 = new Task("sleep", date);

		List list = new ArrayList();
		list.add(task1);
		list.add(task2);
		list.add(task3);

		System.out.println(list);

		System.out.println("ArrayList size:" + list.size());

		Set<Integer> set = new HashSet<Integer>(list);
		
		System.out.println(set);

		System.out.println("ArrayList size:" + set.size());

	}

}
