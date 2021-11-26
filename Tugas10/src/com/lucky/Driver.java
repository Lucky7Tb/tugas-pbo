package com.lucky;

public class Driver extends Member{
	private String noPlat;
	private String jenisKendaraan;

	public Driver(int saldo, String nik, String nama, String noTlp, String noPlat, String jenisKendaraan) {
		super(saldo, nik, nama, noTlp);
		this.noPlat = noPlat;
		this.jenisKendaraan = jenisKendaraan;
	}

	// Transaksi jasa pengantaran (menambah saldo driver dari saldo customer)
	public void transaksiJasaAntar(Customer customer, int jumlahBiaya) {
		if (customer.getSaldo() < jumlahBiaya) {
			System.out.println("Saldo member kurang");
		} else {
			this.setSaldo(this.getSaldo() + jumlahBiaya);
			customer.setSaldo(customer.getSaldo() - jumlahBiaya);
			System.out.println("Berhasil melakukan transaksi");
		}
	}

	@Override
	public void infoMember() {
		super.infoMember();
		System.out.println("Plat: " + noPlat);
		System.out.println("Kendaraan: " + jenisKendaraan);
	}
}
