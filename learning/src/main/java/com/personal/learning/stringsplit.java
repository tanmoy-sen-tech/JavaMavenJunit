package com.personal.learning;

public class stringsplit {

public static void main (String[] args) {
	String str = "select * from table where a=5 and b=10 or c=23";
	String[] x =str.split(" where ");
	System.out.println(x[1]);
	String p = x[1];
	String[] y = p.split(" and ");
	System.out.println(y[0] );
	String t = (y[1] );
	String[] z =t.split(" or ");
	System.out.println(z[0]);
	System.out.println(z[1]);
	String[] ans = {z[0],z[1]};
}
}
