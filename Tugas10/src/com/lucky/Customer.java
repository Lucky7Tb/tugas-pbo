package com.lucky;

public class Customer extends Member{
	public Customer(int saldo, String nik, String nama, String noTlp) {
		super(saldo, nik, nama, noTlp);
	}

	//	Melakukan topup saldo (menambah saldo customer dari saldo driver)
	public void topUpSaldo(Driver driver, int jumlahSaldo) {
		if (driver.getSaldo() < jumlahSaldo) {
			System.out.println("Saldo driver kurang");
		} else {
			this.setSaldo(this.getSaldo() + jumlahSaldo);
			driver.setSaldo(driver.getSaldo() - jumlahSaldo);
			System.out.println("Berhasil melakukan top up");
		}
	}
}
