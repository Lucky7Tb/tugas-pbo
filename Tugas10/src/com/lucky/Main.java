package com.lucky;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
		static Scanner input = new Scanner(System.in);
		static ArrayList<Customer> listCustomer = new ArrayList<>();
		static ArrayList<Driver> listDriver = new ArrayList<>();

    public static void main(String[] args) {
				int pilihan = 0;

				Customer customer1 = new Customer(10000, "10000", "Lucky", "089393993");
				listCustomer.add(customer1);

				Driver driver1 = new Driver(10000, "5000", "Lucky", "089393993", "D111", "Mobil");
				listDriver.add(driver1);

				do {
					System.out.println("1. Input driver atau customer");
					System.out.println("2. Info driver atau customer");
					System.out.println("3. Top up saldo customer");
					System.out.println("4. Transaksi jasa antar");
					System.out.println("5. Keluar");
					System.out.print("Masukan pilihan: ");
					pilihan = Integer.parseInt(input.next());

					switch (pilihan) {
						case 1:
							inputNewMember();
							break;
						case 2:
							listInfoMember();
							break;
						case 3:
							topUp();
							break;
						case 4:
							transaksiJasaAntar();
							break;
						case 5:
							System.out.println("Bye bye");
							break;
						default:
							System.out.println("Tidak ada pilihan yang sesuai");
							break;
					}

				} while (pilihan != 5);
    }

    public static void inputNewMember() {
			int saldo;
			String nik;
			String nama;
			String noTelp;
			System.out.println("1. Customer");
			System.out.println("2. Driver");
			System.out.print("Pilihan type member: ");
			int typeMember = Integer.parseInt(input.next());

			System.out.print("Saldo member: ");
			saldo = Integer.parseInt(input.next());

			System.out.print("Nik member: ");
			nik = input.next();

			System.out.print("Nama member: ");
			nama = input.next();

			System.out.print("No telp member: ");
			noTelp = input.next();

			if (typeMember == 1) {
				Customer newCustomer = new Customer(saldo, nik, nama, noTelp);
				listCustomer.add(newCustomer);
			} else if (typeMember == 2) {
				System.out.print("Plat no member: ");
				String platNo = input.next();
				System.out.print("Jenis kendaraan member: ");
				String jenisKendaraan = input.next();
				Driver newDriver = new Driver(saldo, nik, nama, noTelp, platNo, jenisKendaraan);
				listDriver.add(newDriver);
			} else {
				System.out.println("Tidak ada tipe member tersebut");
			}
		}

		public static void listInfoMember() {
			System.out.println("1. Customer");
			System.out.println("2. Driver");
			System.out.print("Pilihan type member: ");
			int typeMember = Integer.parseInt(input.next());
			System.out.println();
			if (typeMember == 1) {
				for (int i = 0; i < listCustomer.size(); i++) {
					System.out.println("No: " + (i + 1));
					listCustomer.get(i).infoMember();
				}
			} else if (typeMember == 2) {
				for (int i = 0; i < listDriver.size(); i++) {
					System.out.println("No: " + (i + 1));
					listDriver.get(i).infoMember();
				}
			} else {
				System.out.println("Tidak ada tipe member tersebut");
			}
			System.out.println();
		}

    public static void topUp() {
			System.out.print("No customer: ");
			int noCustomer = Integer.parseInt(input.next());
			System.out.print("No driver: ");
			int noDriver = Integer.parseInt(input.next());
			System.out.print("Jumlah saldo yang akan di topup: ");
			int jumlahSaldo = Integer.parseInt(input.next());
			Customer customer = listCustomer.get(noCustomer - 1);
			Driver driver = listDriver.get(noDriver - 1);
			customer.topUpSaldo(driver, jumlahSaldo);
		}

		public static void transaksiJasaAntar() {
			System.out.print("No customer: ");
			int noCustomer = Integer.parseInt(input.next());
			System.out.print("No driver: ");
			int noDriver = Integer.parseInt(input.next());
			System.out.print("Jumlah saldo yang akan di berikan: ");
			int jumlahSaldo = Integer.parseInt(input.next());
			Driver driver = listDriver.get(noDriver - 1);
			Customer customer = listCustomer.get(noCustomer - 1);
			driver.transaksiJasaAntar(customer, jumlahSaldo);
		}
}
