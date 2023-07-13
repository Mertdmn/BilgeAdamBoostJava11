package com.mert.week02lecture004;

public class question16 {

	public static void main(String[] args) {

		/*
		 * 1 den 100 e kadar olan çift sayıların toplamının,tek sayıların toplamına olan
		 * oranı bulalım.
		 */

		int toplamCift = 0;
		int toplamTek = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				toplamCift += i;
			} else {
				toplamTek += i;
			}
		}

		double oran = (double) toplamCift / toplamTek;
		System.out.println("Çift sayıların toplamı: " + toplamCift);
		System.out.println("Tek sayıların toplamı: " + toplamTek);
		System.out.println("Oran: " + oran);

	}

}
