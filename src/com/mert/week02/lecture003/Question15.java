package com.mert.week02.lecture003;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {

		/*
		 * Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz. 0 girildiğinde
		 * sayıların toplamını ve ortalamasını ekrana yazdıralım.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		int number;
		int toplam = 0;
		int sayac = 1;
		double ortalama = 0;
		System.out.print("Lutfen bir sayı giriniz :");
		number = scanner.nextInt();

		while (number != 0) {
			toplam += number;
			ortalama = toplam / (double) sayac;
			System.out.print("Lütfen bir sayı giriniz :");
			number = scanner.nextInt();
			sayac++;
		}

		System.out.println("Toplam : " + toplam + "\nortalama : " + ortalama);

		for (; number != 0; sayac++) {
			toplam += number;
			ortalama = toplam / (double) sayac;
			System.out.println("Lüfen bir sayı giriniz");
			number = scanner.nextInt();
		}
	}

}
