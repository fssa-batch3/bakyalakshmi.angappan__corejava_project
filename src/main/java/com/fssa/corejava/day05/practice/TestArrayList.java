package com.fssa.corejava.day05.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestArrayList {

	// without using generics
	public static void main(String[] args) {

		// Store the city names in the List
		ArrayList cityList = new ArrayList();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		Set s = new HashSet();
		s.add(new Long(50));
		s.add(new Integer(50));
		// Display the city names
		for (Object object : cityList) {
			String cityName = (String) object; // TypeCast object to String
			System.out.println(cityName);
		}

	}

}
