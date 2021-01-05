package com.tutorial;
import java.util.*;
// class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(String nama, String NIM, String jurusan){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public void printData(){
        System.out.println("======== Data Mahasiswa ========");
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.NIM);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("================================");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama,NIM,jurusan;

        System.out.print("Siapa nama kamu = ");
        nama = scan.nextLine();
        System.out.print("Tuliskan NIM mu = ");
        NIM = scan.nextLine();
        System.out.print("Masukan jurusan kamu = ");
        jurusan = scan.nextLine();
        Mahasiswa mshw = new Mahasiswa(nama,NIM,jurusan);
        mshw.printData();




        // Polos polos = new Polos();
        // polos.dataString = "Nathanael Valentino Davis";
        // polos.dataInteger =  10;
        // System.out.println(polos.dataInteger);
        // System.out.println(polos.dataString);
    }
}
