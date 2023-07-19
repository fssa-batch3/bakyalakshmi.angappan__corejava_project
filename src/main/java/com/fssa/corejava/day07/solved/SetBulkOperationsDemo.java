package com.fssa.corejava.day07.solved;

import java.util.HashSet;
import java.util.Set;

public class SetBulkOperationsDemo {
	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);

		System.out.println(s1);

		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(1);
		s2.add(2);
		s2.add(3);
		s2.add(5);

		System.out.println(s2);

//	output - giving only distinct value, union is in hashset

		// var_name.addAll(Collection<?> c);

		Set<Integer> union = new HashSet<Integer>(s1);
		union.addAll(s2);
		System.out.println(union);

//		Retain only the common elements in s1

		Set<Integer> intersection = new HashSet<Integer>(s1);
		intersection.retainAll(s2);
		System.out.println(intersection);

		Set<Integer> difference = new HashSet<Integer>(s1);
		difference.removeAll(s2);
		System.out.println(difference);

	}
}