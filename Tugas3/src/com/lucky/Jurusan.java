package com.lucky;

import java.util.ArrayList;

public class Jurusan {
	private String kode;
	private String nama;
	private ArrayList<Mahasiswa> mhs;

	public Jurusan(String kode, String nama) {
		this.kode = kode;
		this.nama = nama;
		this.mhs = new ArrayList<>();
	}

	public void addMahasiwa(Mahasiswa m) {
		this.mhs.add(m);
	}

	public String getKode() {
		return kode;
	}

	public String getNama() {
		return nama;
	}

	public ArrayList<Mahasiswa> getMhs() {
		return mhs;
	}
}
