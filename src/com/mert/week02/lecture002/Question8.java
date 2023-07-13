package com.mert.week02.lecture002;

import java.util.Scanner;

public class Question8 {

	/*
	 * Dışarıdan girilen bir sayının faktöriyelini hesaplayalım.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Bir Sayı Girin:");

		int sayi = sc.nextInt();
		long faktoriyel = 1;
		for (int i = 1; i <= sayi; ++i) {
			// faktoriyel = faktoriyel * i;
			faktoriyel *= i;
		}
		System.out.printf("%d! = %d \n", sayi, faktoriyel);

	}

}
