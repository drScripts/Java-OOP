package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // overloading pada Constructor
        Player player1 = new Player("Ucup");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Udin");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading methods
        int a = Matematika.tambah(1,19);
        System.out.println("Hasil\t: " + a);
        double b = Matematika.tambah(1,0.98);
        System.out.println("Hasil\t: " + b);


    }
}
