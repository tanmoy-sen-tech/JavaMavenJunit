package com.personal.learning;

public class sqlsplit {

	public static void main(String[] args) {
		String input1 = "select empname,empcity from emp.txt where empcity=hyderabad";
		String input2 = "select empname,empcity from emp.txt where empcity=hyderabad and empsalary>50000";
		String[] response1 = splitString(input1);
		String[] response2 = splitString(input2);
		printArray(response1);
		printArray(response2);
	}

	public static String[] splitString(String queryString) {
		final String query = queryString.toLowerCase();
		if (!query.contains("where")) {
			String[] nodata = {};
			return nodata;
		}
		String out = (query.split("where")[1]);
		if (out.contains("and")) {
			String[] res = out.split("and | or");
			return res;
		} else {
			String[] resp = { out };
			return resp;
		}
	}

	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
