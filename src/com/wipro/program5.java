package com.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
        Arrays.sort(a);
        System.out.println("The largest two numbers in the array " + a[a.length-1] + " " + a[a.length-2]);
        System.out.println("The smallest two numbers in the array " + a[0] + " "  + a[1]);

}
}