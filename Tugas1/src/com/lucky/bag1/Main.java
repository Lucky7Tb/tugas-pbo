package com.lucky.bag1;

public class Main {

    public static void main(String[] args) {
	    Barang barang1 = new Barang("BRG-001", "Tas Gucci");
        Barang barang3 = new Barang("BRG-003", "Koper", 150);


	    Barang barang2 = new Barang("BRG-002", "Printer Epson L355");

	    barang1.setHarga(1200);
	    barang2.setHarga(200);

        barang1.printData();
        System.out.println();
	    barang2.printData();


        Barang barang4 = new Barang("BRG-004", "Helm", 20);

        barang3.printData();
        System.out.println();
        barang4.printData();

        System.out.print("\nTotal harga barang 1, 3, dan 4: ");
        System.out.print(barang1.getHarga() + barang3.getHarga() + barang4.getHarga());
    }
}
