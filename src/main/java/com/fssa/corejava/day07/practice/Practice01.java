package com.fssa.corejava.day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);

		Set<Integer> set = new HashSet<Integer>(list);

		System.out.print(set);

	}

}
