package com.mert.week02lecture004;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı giriniz");
		int sayi = scanner.nextInt();
		int sayac;
		if (sayi == 2) {
			System.out.println("Asal sayidir");
		} else if (sayi % 2 == 0 || sayi == 1) {
			System.out.println("Sayi asal değildir.");
		}
	}

}
