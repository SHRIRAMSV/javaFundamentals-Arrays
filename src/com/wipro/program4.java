package com.wipro;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		char ch[];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
            ch = Character.toChars(a[i]); 
            System.out.print(ch);
		}
		
	}
}
