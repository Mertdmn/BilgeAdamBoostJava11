package com.mert.week02.lecture002;

import java.util.Scanner;

public class Question7 {

	/*
	 * Dışarıdan 2 tane tam sayısal değer alacağım. İki sayının toplamı çift ise
	 * true, değilse false yazacağım.
	 * 
	 * bu deperlerin bir de ortalaasını alalım
	 */

	public static void main(String[] args) {

		int sayi1, sayi2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen İlk sayiyi giriniz: ");
		sayi1 = scanner.nextInt();
		System.out.print("Lutfen ikinci sayiyi giriniz: ");
		sayi2 = scanner.nextInt();

		int toplam = sayi1 + sayi2;
		System.out.println(toplam);
		boolean ciftMi = toplam % 2 == 0;
		System.out.println(ciftMi);
		double ortalama = toplam / 2d;

	}

}
