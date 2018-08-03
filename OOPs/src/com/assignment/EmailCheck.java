package com.assignment;

public class EmailCheck {

	public static void main(String[] args) {
		String s = new String("imfz@gil.co");
		int a = s.indexOf('@');
		int b = s.lastIndexOf('@');
		int e = s.length() - 1;
		int d = s.indexOf('.');
		int c = s.lastIndexOf('.');
		if (a == b && c == d && a > 3 && d - a - 1 > 2 && e - c > 1) {
			System.out.println("valid");
		} else
			System.out.println("not valid");
	}

}
