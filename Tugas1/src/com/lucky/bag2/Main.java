package com.lucky.bag2;

public class Main {

    public static void main(String[] args) {
	    Buku buku1 = new Buku("Harry Potter", "J.K Rowling", 30000);
	    Buku buku2 = new Buku("UML", "Ivar Jacobson", 40000);

	    buku1.printData();
        System.out.println();
	    buku2.printData();
    }
}
