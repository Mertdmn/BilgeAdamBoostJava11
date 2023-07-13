package com.mert.week02.lecture003;

public class Question10 {

	public static void main(String[] args) {

		/*
		 * 1'den başlayarak Kullanıcın dışarıdan girdiği sayıya kadar olan (sayı dahil)
		 * sayıların 1 fazlasının toplamını ekranda yazdıran program.
		 * 
		 * 
		 */

		int toplam = 0;
		int i = 1;
		int sayac = 0;
		while (toplam <= 50) {
			toplam += (i);
			i++;
			System.out.println("Toplam =>> " + toplam + "Döngü =>>" + sayac);
		}

	}

}
