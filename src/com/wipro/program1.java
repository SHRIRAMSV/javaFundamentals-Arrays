package com.wipro;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		int sum = 0, average = 0;
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];

		}
		System.out.println("The sum of the array" + sum);
		System.out.println("The average of the array" + sum / size);
	}

}
