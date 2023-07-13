package com.mert.week02.lecture002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*
		 * Dairenin alanını ve çevresini bulalım. yarı çap dışarıdan input olarak
		 * girilecek. pi=3.14
		 */

		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Lutfen yaricapi giriniz");
		double yaricap = scanner.nextDouble();

		double alan = pi * yaricap * yaricap;
		double cevre = 2 * pi * yaricap;

		System.out.println("Alan = " + alan + "\nCevre =" + cevre);

	}

}
