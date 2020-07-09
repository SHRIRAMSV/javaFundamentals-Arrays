package com.wipro;

public class program14 {

	public static void main(String[] args) {
		if(args.length<9) {
			System.out.println("Please enter 9 integer numbers");
		}
		else {
		int a[][] = new int[3][3];
		int big = 0;
		int k = 0;
		while (k < 9) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					a[i][j] = Integer.parseInt(args[k]);					
					k++;

				}
			}
		}

		System.out.println("The given array is :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("The biggest number in the array is ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (big < a[i][j]) {
					big = a[i][j];
				}
			}

		}
		System.out.print(big);
	}

}
}