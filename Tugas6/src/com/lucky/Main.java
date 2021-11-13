package com.lucky;

public class Main {

    public static void main(String[] args) {
			Departemen departemen1 = new Departemen("Marketing");
			Karyawan karyawan1 = new Tetap("Lucky Tri Bhakti", 1500000, 5000000);
			Karyawan karyawan2 = new Tetap("Terra Brown", 1500000, 5000000);
			Karyawan karyawan3 = new Kontrak("Jonathan Mason", 10, 5000000);

			departemen1.addKaryawan(karyawan1);
			departemen1.addKaryawan(karyawan2);
			departemen1.addKaryawan(karyawan3);

			System.out.println("Departemen Marketing: ");
			System.out.println("1. Semua: ");
			departemen1.displayAll();
			System.out.println("2. Tetap: ");
			departemen1.displayTetap();
			System.out.println("3. Kontrak: ");
			departemen1.displayKontrak();

			System.out.println("-----------------------");

			Departemen departemen2 = new Departemen("Developer");
			Karyawan karyawan4 = new Tetap("Eren", 1500000, 5000000);
			Karyawan karyawan5 = new Kontrak("Levi", 5, 5000000);
			Karyawan karyawan6 = new Kontrak("Mikasa", 10, 5000000);

			departemen2.addKaryawan(karyawan4);
			departemen2.addKaryawan(karyawan5);
			departemen2.addKaryawan(karyawan6);

			System.out.println("Departemen Developer: ");
			System.out.println("1. Semua: ");
			departemen2.displayAll();
			System.out.println("2. Tetap: ");
			departemen2.displayTetap();
			System.out.println("3. Kontrak: ");
			departemen2.displayKontrak();
    }
}
