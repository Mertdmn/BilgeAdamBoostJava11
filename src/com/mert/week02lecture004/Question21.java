package com.mert.week02lecture004;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {

		/*
		 * Kullanıcı 1 ile 7 arasında bir sayı girsin.(1 ve 7 dahil) Bu sayıya denk
		 * gelen haftanın gününü yazdıralım.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("1 ile 7 arasında bir sayı girin: ");
		int sayi = scanner.nextInt();

		String gun;

		switch (sayi) {
		case 1:
			gun = "Pazartesi";
			break;
		case 2:
			gun = "Salı";
			break;
		case 3:
			gun = "Çarşamba";
			break;
		case 4:
			gun = "Perşembe";
			break;
		case 5:
			gun = "Cuma";
			break;
		case 6:
			gun = "Cumartesi";
			break;
		case 7:
			gun = "Pazar";
			break;
		default:
			gun = "Geçersiz sayı girdiniz!";
			break;
		}

		System.out.println("Girdiğiniz sayıya karşılık gelen gün: " + gun);
	}

}
