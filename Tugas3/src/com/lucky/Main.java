package com.lucky;

public class Main {

    public static void main(String[] args) {
	      Jurusan jurusan1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
	      Jurusan jurusan2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

	      Mahasiswa m1 = new Mahasiswa("6701", "Rendi");
	      Mahasiswa m2 = new Mahasiswa("6702", "Chaca");
	      Mahasiswa m3 = new Mahasiswa("6703", "Agus");

	      jurusan1.addMahasiwa(m1);
	      jurusan1.addMahasiwa(m2);
	      jurusan1.addMahasiwa(m3);

        Mahasiswa m4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa m5 = new Mahasiswa("6302", "Siska");
        Mahasiswa m6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa m7 = new Mahasiswa("6304", "Rahmat");

        jurusan2.addMahasiwa(m4);
        jurusan2.addMahasiwa(m5);
        jurusan2.addMahasiwa(m6);
        jurusan2.addMahasiwa(m7);

				int no = 1;
				System.out.println(
					"Kode: " + jurusan1.getKode() + "\n" +
					"Nama: " + jurusan1.getNama() + "\n" +
					"Daftar mahasiswa: "
				);

				for (Mahasiswa m : jurusan1.getMhs()) {
					System.out.println(no + ". " + m.getNim() + " - " + m.getNama());
					no++;
				}

				System.out.println();

				no = 1;
				System.out.println(
					"Kode: " + jurusan2.getKode() + "\n" +
					"Nama: " + jurusan2.getNama() + "\n" +
					"Daftar mahasiswa: "
				);

				for (Mahasiswa m : jurusan2.getMhs()) {
					System.out.println(no + ". " + m.getNim() + " - " + m.getNama());
					no++;
				}
    }
}
