package com.mert.week02lecture004;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {

		/*
		 * telefon kodu ve email kodu tanımlayacağız. Kullanıcıdan e-mail ve telefon
		 * kodu girmesini isteyeceğiz. girilen e-mail kodu hatalı ise ;
		 * "Girdiğiniz e-mail kodu hatalıdır". girilen sms kodu hatalı ise;
		 * "Girdiğiniz sms kodu hatalıdır".
		 */

		Scanner scanner = new Scanner(System.in);
		int smsCode = 444;
		int smsInput;
		int emailCode = 555;
		int emailInput;

		System.out.println("Lütfen sms kodunu giriniz : ");
		smsInput = scanner.nextInt();
		System.out.println("Lütfen email kodunuzu giriniz : ");
		emailInput = scanner.nextInt();

		if (smsCode != emailInput) {
			System.out.println("Email kodunuz yanlış");
		}
		if (emailCode != emailInput) {
			System.out.println("Email kodunuz yanlış");
		}

		if (smsCode == smsInput && emailCode == emailInput) {
			System.out.println("Başarıyla giriş yaptınız!");
		}
		scanner.close();

	}

}
