package com.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
        Arrays.sort(a);
        System.out.println("The maximum value of the array" + a[a.length-1]);
        System.out.println("The minimum value of the array" + a[0]);
	}

}
