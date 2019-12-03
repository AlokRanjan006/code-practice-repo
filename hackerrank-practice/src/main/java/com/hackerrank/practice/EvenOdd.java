package com.hackerrank.practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scn.nextInt();
		String ans = "";
		if (num > 1 && num <= 100) {
			if (num % 2 == 1) {
				ans = "weird";
			}
			else {
				if(num>=2 && num<=5) {
					ans = "not weird";
				}
				else if (num>= 6 && num <=20) {
					ans= "wired";
				}
				else if(num>20) {
					ans = "not weird";
				}

			}
		}
		else {
			ans ="Invalid No! Enter a number between 1 and 100";
		}
		System.out.println(ans);
		scn.close();
	}



}


