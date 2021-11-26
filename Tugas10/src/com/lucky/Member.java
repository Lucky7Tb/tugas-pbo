package com.lucky;

public class Member {
	protected  int saldo;
	protected String nik;
	protected String nama;
	protected String noTlp;

	public Member(int saldo, String nik, String nama, String noTlp) {
		this.saldo = saldo;
		this.nik = nik;
		this.nama = nama;
		this.noTlp = noTlp;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void infoMember() {
		System.out.println("Nik: " + nik);
		System.out.println("Nama: " + nama);
		System.out.println("No Telp: " + noTlp);
		System.out.println("Saldo: " + saldo);
	}
}
