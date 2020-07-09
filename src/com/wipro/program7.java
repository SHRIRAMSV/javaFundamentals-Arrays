package com.wipro;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		 
		int i = arr.length,h = 0;
		int[] count = new int[6];
		for(int k = arr.length-1 ; k >= 0; k--){
			int c1 = 0;
			for(int j = 0; j < arr.length-h-1 ; j++){
				if(arr[k] == arr[j]){
					c1 += 1;
				}
			}
			count[--i] = c1;
			h++;
		}
		for(i = 0; i < arr.length; i++){
			if(count[i] >= 1) 
				continue;
			else 
				System.out.print(arr[i]+" ");
		}
	}
}