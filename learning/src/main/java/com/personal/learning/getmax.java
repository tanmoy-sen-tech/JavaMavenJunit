package com.personal.learning;

import java.util.Scanner;

public class getmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,res;
		System.out.println("enter two numbers ");
		Scanner sc = new Scanner(System.in);
		number1 = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		number2 = sc1.nextInt();
		res = findMax(number1, number2);
		System.out.println("the highest number is " + res);
	}
	public static int findMax(int a,int b) {
	if(a>b) {
		return a;
	} else {
		return b;
	}
	
	}

}
