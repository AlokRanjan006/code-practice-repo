package com.hackerrank.practice;

import java.util.Scanner;

public class OddEven {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number");

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String ans = "";

		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			if (n >= 2 && n <= 5)
				ans = "Not Weird";
			else if (n >= 6 && n <= 20)
				ans = "Weird";
			else if (n > 20)
				ans = "Not Weird";

		}

		System.out.print(ans);

		scanner.close();
	}

}
