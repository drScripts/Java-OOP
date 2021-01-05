package com.tutorial;

class Buku{
    String judul,penulis;

    Buku(String judul,String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("Buku : " + this.judul + ", ditulis oleh " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("gatau","saya");
        buku1.display();


        // menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);
        // assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // karena buku1 dan buku2 berada pada address atau reference yang sama
        buku1.judul = "bambang";
        buku1.penulis = "nathan";
        buku1.display();
        buku2.display();

        // memasukan object ke dalam method
        System.out.println();
        fungsiSembarang(buku2);
        buku1.display();
    }

    public static void fungsiSembarang(Buku dataBuku){
        String adds = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(adds);
        dataBuku.judul = "bimbing";
        dataBuku.display();
    }

}