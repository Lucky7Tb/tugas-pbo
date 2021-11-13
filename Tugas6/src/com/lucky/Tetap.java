package com.lucky;

public class Tetap extends Karyawan{
	private double tuDas;

	public Tetap(String nama, double tuDas, double gaDas) {
		super(nama, tuDas);
		this.tuDas = tuDas;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Tunjangan Dasar: " + this.tuDas);
		System.out.println();
	}
}
