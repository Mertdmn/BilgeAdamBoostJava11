package com.mert.week02.lecture003;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

		/*
		 * Kullanıcıdan girilen 1-10 arasındaki sayının çarpım tablosunu yazdıran
		 * program.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Bir Sayı Giriniz:");
//
//		int num = scanner.nextInt();
//		for (int i = 1; i <= 10; ++i) {
//		System.out.printf("%d * %d = %d \n", num, i, num * i);
//		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz:");
		int sayi = scanner.nextInt();
		for (int i = 1; i <= 10; ++i) {
			int carpim = sayi * i;
			System.out.println(sayi + "x" + "=" + carpim);
		}

	}

}
