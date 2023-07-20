package com.fssa.corejava.day08.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String[] names = input.split(",");

		HashMap<String, Integer> nameCounts = new HashMap<>();

		for (String name : names) {

//		map.getOrDefault(Object key,Default value)

			// if there is no key then it will return 0

//			if ram aldready have 1 then count is increased

			nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
		}

		System.out.println(nameCounts);

//	keyset()   - used to create a set out of the key elements contained in the hash map
//	value() - [2,1,2,2,1]
//  entrySet() - [{"ram":1},{"superman":1}]

		// Print the count for each element in names set
		for (String name : nameCounts.keySet()) {
			int count = nameCounts.get(name);
			System.out.println(name + ": " + count);
		}
	}

}
