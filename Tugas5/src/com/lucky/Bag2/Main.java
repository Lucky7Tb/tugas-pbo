package com.lucky.Bag2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Segitiga segitiga = new Segitiga();
		int pilihan = 0;
		double alas = 0;
		double tinggi = 0;

		do {
			System.out.println("1. Diketahui alas segitiga");
			System.out.println("2. Diketahui alas dan tinggi");
			System.out.println("3. Exit");
			System.out.print("Masukan pilihan: ");
			pilihan = scan.nextInt();

			switch (pilihan) {
				case 1:
					System.out.print("Masukan alas: ");
					alas = scan.nextDouble();
					segitiga.hitung(alas);
					break;
				case 2:
					System.out.print("Masukan alas: ");
					alas = scan.nextDouble();
					System.out.print("Masukan tinggi: ");
					tinggi = scan.nextDouble();
					segitiga.hitung(alas, tinggi);
					break;
				case 3:
					System.out.println("Sampai jumpa");
					break;
				default:
					System.out.println("Pilihan tidak ada");
					break;
			}

		} while(pilihan != 3);
	}
}
