package com.tutorial;
import java.util.*;

class Mahasiswa{
    String name;
    String NIM;

    Mahasiswa(String nama,String NIM){
        this.name = nama;
        this.NIM  = NIM;
    }

    void printDataSekarang(){
        System.out.println("Nama : " + this.name);
        System.out.println("NIM  : " + this.NIM);
    }

    void ubahData(String Name){
        this.name = Name;
    }

    void ubahNim(String NIM){
        this.NIM = NIM;
    }

    String getName(){
        return this.name;
    }

    String getNIM(){
        return this.NIM;
    }

    String sayHi(String message){
        return message + " hello bro " + this.name;
    }
}

public class Main {
    public static void main(String[] args) {
        String name = "Nathanael Valentino Davis";
        String NIM = "181910085";
        Mahasiswa mhs = new Mahasiswa(name,NIM);
        mhs.printDataSekarang();
        System.out.println("");
        name = "Wilson Clay";
        mhs.ubahData(name);
        mhs.ubahNim("181910000");
        mhs.printDataSekarang();
        System.out.println("");
        mhs.ubahData("Claresta");
        mhs.ubahNim("181910024");
        System.out.println("Nama : " + mhs.getName());
        System.out.println("Date : " + mhs.getNIM());
        System.out.println("");
        System.out.println(mhs.sayHi("selamat pagi,"));
    }

}
