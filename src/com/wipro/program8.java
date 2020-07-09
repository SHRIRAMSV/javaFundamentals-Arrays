package com.wipro;

import java.util.*;

public class program8 {

	   public static void main(String[] args) {
	        int arr[] = new int[args.length];
	        int j = 0;
	        int index = 0, index1 = 0;
	        for(String a  : args){ 
	            arr[j] = Integer.parseInt(a);
	            if(arr[j] == 6) index = j;
	            if(arr[j] == 7) index1 = j;
	            j++;
	        }
	        int sum = 0;
	        for(j = 0 ; j < args.length; j++){
	            if((j >= index) && (j <= index1)) continue;
	            else sum += arr[j];        
	        }
	        System.out.println(sum);
	    }
	}