package com.fssa.corejava.day08.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		// Split the input string by commas
		String[] names = input.split(", ");

		HashMap<String, Integer> nameCounts = new HashMap<>();

		for (String name : names) {
			nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
			System.out.println(nameCounts);
		}

		System.out.println(nameCounts);

		// Print the count for each name
		for (String name : nameCounts.keySet()) {
			int count = nameCounts.get(name);
			System.out.println(name + ": " + count);
		}
	}

}
