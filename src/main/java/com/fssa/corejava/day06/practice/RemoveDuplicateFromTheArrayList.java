package com.fssa.corejava.day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromTheArrayList {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		///// METHOD I

		Set<String> set = new HashSet<>(cityList.size());
		cityList.removeIf(p -> !set.add(p));

		System.out.println(cityList);

		///// METHOD II

		List<String> listWithoutDuplicates = cityList.stream().distinct().collect(Collectors.toList());
		System.out.println(listWithoutDuplicates);

	}

}
