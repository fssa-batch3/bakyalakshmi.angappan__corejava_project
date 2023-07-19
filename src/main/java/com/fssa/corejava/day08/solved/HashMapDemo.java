package com.fssa.corejava.day08.solved;

import java.util.HashMap;

/**
 * @author BharathwajSoundarara
 *
 */
public class HashMapDemo {
	public static void main(String[] args) {

		// Task: store department name and no of employees working in the department
		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);

		System.out.println(deptMap);

		System.out.println(deptMap.keySet());

		// Iterate

//		used to create a set out of the key elements contained in the hash map.

//		deptMap.get(deptName) - retrieves the value associated with the current department name (deptName) 

//		deptName - variable name

		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);

			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}

	}

}