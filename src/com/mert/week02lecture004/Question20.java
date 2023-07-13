package com.mert.week02lecture004;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {

		/*
		 * Girilen sayının 5'in kuvveti olup olmadığını bulan program
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz  :");
		int number = scanner.nextInt();
		boolean control = true;

		if (number == 1) {
			System.out.println("Sayi 5'in kuvvetidir.");
			control = false;
		} else if (number < 0) {
			System.out.println("Lütfen pozitif bir sayı giriniz.");
			control = false;
		}

		while (true) {

			if (number % 5 == 0) {
				number /= 5;
				if (number == 1) {
					System.out.println("Sayı 5'in kuvvetidir!!");
				}
			} else {
				System.out.println("Sayi 5'in kuvveti değildir! ");
			}
		}

	}

}
