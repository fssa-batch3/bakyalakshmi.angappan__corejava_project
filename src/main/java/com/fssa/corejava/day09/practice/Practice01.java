package com.fssa.corejava.day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers: ");

		ArrayList<Integer> arraylist = new ArrayList<>(5);

		for (int i = 0; i < 5; i++) {
			arraylist.add(in.nextInt());
		}

		in.close();

		System.out.println("Sorted list: ");

		Collections.sort(arraylist);
		System.out.print(arraylist);

	}

}
