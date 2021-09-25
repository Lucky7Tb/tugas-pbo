package com.lucky.bag1;

public class Barang {
    private String idProduk;
    private String nama;
    private double harga;

    public Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void printData() {
        System.out.println("idBarang: " + this.getIdProduk());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Harga($): " + this.getHarga());
    }
}
