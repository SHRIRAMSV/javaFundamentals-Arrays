package com.wipro;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		boolean flag = false;
		int index = 0;
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Enter the element to be searched");
		int searchElement = sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (a[i] == searchElement) {
				flag = true;
				index = i;
				break;
			}
		}

		if (flag == true) {
			System.out.println(index);
		} else {
			System.out.println("-1");
		}
	}

}
