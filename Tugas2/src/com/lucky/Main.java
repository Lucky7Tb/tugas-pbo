package com.lucky;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Book> listBook = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String isbnKey;
		boolean exit = false;

		Book book1 = new Book(
			"001",
			"Laskar pelangi",
			"Andrea Hirata",
			"2008",
			50000,
			10f
		);

		Book book2 = new Book(
			"002",
			"Bukan Dilan dan Milea",
			" Bahrul Bangsawan",
			"2021",
			4000,
			1.2f
		);

		listBook.add(book1);
		listBook.add(book2);

		do {
			int pilihan;

			System.out.println("1. Tampilkan semua buku");
			System.out.println("2. Cari buku");
			System.out.println("3. Tambah buku");
			System.out.println("4. Ubah buku");
			System.out.println("5. Hapus buku");
			System.out.println("6. Keluar");
			System.out.print("Masukan pilihan anda: ");
			pilihan = Integer.parseInt(scan.nextLine());

			switch (pilihan) {
				case 1:
					for (Book book : listBook) {
						book.printData();
					}
					break;
				case 2:
					System.out.print("Masukan isbn buku: ");
					isbnKey = scan.nextLine();
					Book searchedBook = null;
					for (Book book : listBook) {
						if (book.getIsbn().equals(isbnKey)) {
							searchedBook = book;
							break;
						}
					}

					if (searchedBook != null) {
						System.out.println("Hasil pencarian: ");
						searchedBook.printData();
					} else {
						System.out.println("Buku tidak ada");
					}
					break;
				case 3:
					System.out.print("Masukan isbn buku: ");
					String isbn = scan.nextLine();
					System.out.print("Masukan judul buku: ");
					String judul = scan.nextLine();
					System.out.print("Masukan pengarang buku: ");
					String pengarang = scan.nextLine();
					System.out.print("Masukan tahun terbit buku: ");
					String tahunTerbit = scan.nextLine();
					System.out.print("Masukan harga buku: ");
					int harga = Integer.parseInt(scan.nextLine());
					System.out.print("Masukan rating buku: ");
					float rating = Float.parseFloat(scan.nextLine());
					listBook.add(new Book(isbn, judul, pengarang, tahunTerbit, harga, rating));
					break;
				case 4:
					System.out.print("Masukan isbn buku yang akan diupdate: ");
					isbnKey = scan.nextLine();
					Book editedBook = null;
					int editedBookIndex = -1;
					for (int i = 0; i < listBook.size(); i++) {
						if (listBook.get(i).getIsbn().equals(isbnKey)) {
							editedBook = listBook.get(i);
							editedBookIndex = i;
							break;
						}
					}
					if (editedBook != null) {
						System.out.println("Masukan data-data yang akan diedit. Kosongkan jika tidak ingin di edit");
						System.out.print("Masukan judul buku: ");
						String tmpJudul = scan.nextLine();
						if (!tmpJudul.isEmpty()) editedBook.setJudul(tmpJudul);
						System.out.print("Masukan pengarang buku: ");
						String tmpPengarang = scan.nextLine();
						if (!tmpPengarang.isEmpty()) editedBook.setPengarang(tmpPengarang);
						System.out.print("Masukan tahun terbit buku: ");
						String tmpTahunTerbit = scan.nextLine();
						if (!tmpTahunTerbit.isEmpty()) editedBook.setTahunTerbit(tmpTahunTerbit);
						System.out.print("Masukan harga buku: ");
						String tmpHarga = scan.nextLine();
						if (!tmpHarga.isEmpty()) editedBook.setHarga(Integer.parseInt(tmpHarga));
						System.out.print("Masukan rating buku: ");
						String tmpRating = scan.nextLine();
						if (!tmpRating.isEmpty()) editedBook.setRating(Float.parseFloat(tmpRating));

						listBook.set(editedBookIndex, editedBook);
					} else {
						System.out.println("Buku tidak ada");
					}
					break;
				case 5:
					System.out.print("Masukan isbn buku yang akan dihapus: ");
					isbnKey = scan.nextLine();
					Book deletedBook = null;
					for (Book book : listBook) {
						if (book.getIsbn().equals(isbnKey)) {
							deletedBook = book;
							break;
						}
					}

					if (deletedBook != null) {
						listBook.remove(deletedBook);
					} else {
						System.out.println("Buku tidak ada");
					}
					break;
				case 6:
					exit = true;
					break;
				default:
					System.out.println("Pilihan tidak ada");
					break;
			}
			System.out.println();
		} while (!exit);

		System.out.println("Dadah, datang lagi ya 👋");
	}
}
