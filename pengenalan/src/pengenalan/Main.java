package pengenalan;

import java.util.*;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}



public class Main {

    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Nathanael Valentino Davis";
        mahasiswa1.NIM = "181910085";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 3.5;
        mahasiswa1.umur = 17;

        System.out.println("========== Data Mahasiswa =========");
        System.out.println("Nama    : " + mahasiswa1.nama);
        System.out.println("NIM     : " + mahasiswa1.NIM);
        System.out.println("Jurusan : " + mahasiswa1.jurusan);
        System.out.println("IPK     : " + mahasiswa1.IPK);
        System.out.println("Umur    : " + mahasiswa1.umur);
        System.out.println("===================================");
    }
}
