package com.desco.employee;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int r = 129;
		byte p = (byte) r;
		String x = "10";
		int y = Integer.parseInt(x);
		int a = 5, b = 3, c = 2;
		float d = 0, e, f;
		double g, h, i;
		// d=(a++/b++ - --b/a++ +c)<<1;
		System.out.println(c);
		System.out.println(y);

		Scanner input = new Scanner(System.in);
		// System.in input;
		// a = input.nextInt();
		// b = input.nextInt();
		// c = input.nextInt();

		if (a > b) 
			if (a > c) {
				// System.out.println(a);
				d = (float) a;
		} else if (b > c && b > a) {
			// System.out.println(b);
			d = (float) b;
		} else {
			// System.out.println(c);
			d = (float) c;
		}
		System.out.println(d + " Highest");

		switch (a) {
		case 5:
			System.out.println("1st");
			break;
		default:
			System.out.println("Lost");
			break;

		}
	}

}
