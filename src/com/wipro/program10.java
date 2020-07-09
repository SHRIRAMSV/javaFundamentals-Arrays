package com.wipro;

public class program10 {

	static void evenOdd(int[] arr){
		int i;
		int[] new_arr = new int[arr.length];
		int j = 0,k = arr.length-1;
		for(i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				new_arr[j] = arr[i];
				j++;
			}
			else{
				new_arr[k] = arr[i];
				k--;
			}
		}
		System.out.print("[");
		for(i = 0; i < new_arr.length; i++){
			if(i < new_arr.length - 1)
				System.out.print(new_arr[i]+",");
			else
				System.out.print(new_arr[i]+"]");
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		int i = 0;
		for(String str : args){
			arr[i] = Integer.parseInt(str);
			i++;
		}
		evenOdd(arr);
	}
}
