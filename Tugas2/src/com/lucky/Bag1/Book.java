package com.lucky.Bag1;

public class Book {
    private String isbn;
    private String judul;
    private String pengarang;
    private String tahunTerbit;
    private int harga;
    private float rating;

    public Book(String isbn, String judul, String pengarang, String tahunTerbit, int harga, float rating) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public  String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void printData() {
        System.out.print(
                "\nISBN: " + isbn +
                "\nJudul: " + judul +
                "\nPengarang: " + pengarang +
                "\nTahun Terbit: " + tahunTerbit +
                "\nHarga: " + harga +
                "\nRating: " + rating
        );
        System.out.println();
    }
}
