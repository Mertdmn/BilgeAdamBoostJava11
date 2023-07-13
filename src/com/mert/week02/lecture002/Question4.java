package com.mert.week02.lecture002;

public class Question4 {

	public static void main(String[] args) {

		/*
		 * 
		 * İki tane string değişken oluşturalım. İsim ve soysiim olsun. Sonra bu
		 * değişkenleri bir şekilde ekrana yazdıralım.
		 * 
		 * a ve b karakterlerinin değerin, yazdırın. Sonra da karakter değer toplamını
		 * yazdıralım.
		 * 
		 */

		String isim = "Mert";
		String soyisim = "Duman";
		String isimSoyisim = "İsim:" + isim + "soyİsim" + soyisim;

		System.out.println(İsimSoyisim);

		// System.out.println("İsim:" + isim + "soyisim:" + soyisim);
		// System.out.println("isim:" + isim);
		System.out.println("soyisim:" + soyisim);
		System.out.println("####");
		System.out.println("İsim:" + İsim + "\nsoyisim:" + soyisim);

		// ctrl+ shift + 7
		char a = 'a';
		char b = 'b';
		System.out.println("ASCIII a:" + a + "\nASCII b:" + b);
		System.out.println(a + b);

	}

}
