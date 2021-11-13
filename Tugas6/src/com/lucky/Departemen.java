package com.lucky;

public class Departemen {
	private String nama;
	private Karyawan[] kar;
	private int index = -1;

	public Departemen(String nama) {
		this.nama = nama;
		this.kar = new Karyawan[3];
	}

	public void addKaryawan(Karyawan k) {
		index = index + 1;
		this.kar[index] = k;
	}

	public void displayAll() {
		for (Karyawan karyawan : this.kar) {
			karyawan.display();
		}
	}

	public void displayTetap() {
		for (Karyawan karyawan: this.kar) {
			if (karyawan instanceof Tetap) {
				karyawan.display();
			}
		}
	}

	public void displayKontrak() {
		for (Karyawan karyawan: this.kar) {
			if (karyawan instanceof Kontrak) {
				karyawan.display();
			}
		}
	}
}
