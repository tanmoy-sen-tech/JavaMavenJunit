package com.personal.learning;

import java.util.Scanner;
import java.util.Stack;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int input[] ={3,60,35,2,45,320,5};  

		  int[] res = sortArray(input);
		  System.out.println("Array After Bubble Sort");  
          for(int i=0; i < res.length; i++){  
                  System.out.print(res[i] + " ");  
          }  
	}
	public static int[] sortArray(int[] arr) {
		int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
		
	}
         }
         return arr;
	}
}
