package com.lucky.Bag2;

public class Segitiga {
	public void hitung(double alas) {
		double tinggi = Math.pow(alas, 2) - Math.pow((alas / 2), 2);
		double luas = (alas * tinggi) / 2;
		double keliling = alas * alas * alas;
		System.out.println("Luas segitiga: " + luas);
		System.out.println("Keliling segitiga: " + keliling);
	}

	public void hitung(double alas, double tinggi) {
		double luas = (alas * tinggi) / 2;
		double keliling = alas * alas * alas;
		System.out.println("Luas segitiga: " + luas);
		System.out.println("Keliling segitiga: " + keliling);
	}
}

