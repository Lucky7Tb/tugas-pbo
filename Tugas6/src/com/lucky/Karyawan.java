package com.lucky;

public class Karyawan {
	protected String nama;
	protected double gaDas;

	public Karyawan(String nama, double gaDas) {
		this.nama  = nama;
		this.gaDas = gaDas;
	}

	public void display() {
		System.out.println("Nama: " + this.nama);
		System.out.println("Gaji dasar: " + this.gaDas);
	}
}
