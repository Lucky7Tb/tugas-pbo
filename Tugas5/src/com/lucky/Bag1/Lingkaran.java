package com.lucky.Bag1;

public class Lingkaran {
	public static void hitungLuas(float jariJari) {
		float luasLingkaran = 3.14f * (jariJari * jariJari);
		System.out.printf("Luas lingkaran: %.2f", luasLingkaran);
		System.out.println();
	}

	public static	void hitungLuas(double diameter) {
		double jariJari = diameter / 2;
		double luasLingkaran = 3.14 * (jariJari * jariJari);
		System.out.printf("Luas lingkaran: %.2f", luasLingkaran);
		System.out.println();
	}

	public static void hitungKeliling(float jariJari) {
		double luasLingkaran = 2 * 3.14 * jariJari;
		System.out.printf("Diameter lingkaran: %.2f", luasLingkaran);
		System.out.println();
	}

	public static void hitungKeliling(double diameter) {
		double jariJari = diameter / 2;
		double luasLingkaran = 2 * 3.14 * jariJari;
		System.out.printf("Diameter lingkaran: %.2f", luasLingkaran);
		System.out.println();
	}
}
