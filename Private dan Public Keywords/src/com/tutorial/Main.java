package com.tutorial;



class Player{
    String name; // default class bisa di modif secara bebas
    public int exp; // public sama dengan default bisa di mofid secara bebas
    private int health; // private hanyaa bisa di modif dari dalam class saja

    Player(String name,int exp,int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default access modifier (bisa diakses dimana saja)
    void display(){
        System.out.println("Nama   : " + this.name);
        System.out.println("Exp    : " + this.exp);
        System.out.println("Health : " + this.health);
    }

    // public access modifier (bisa diakses dimana saja)
    public void displayp(){
        System.out.println("Nama   : " + this.name);
        System.out.println("Exp    : " + this.exp);
        System.out.println("Health : " + this.health);
    }

    // privae access modifier (Hanyaa bisa dipanggil atau diaccess di class ini saja)
    private void displaypr(){
        System.out.println("Nama   : " + this.name);
        System.out.println("Exp    : " + this.exp);
        System.out.println("Health : " + this.health);
    }

    public void ubahHealth(int health){
        this.health = health;
        display();
    }

}


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("marni",10,100);

        // default

            // read data
            player1.display();
            // write data (editable)
            player1.name = "nathan";
            // read
            player1.display();

        // public
            player1.exp = 100;
            player1.display();

        // private
           // player1.health = 100; // tidak bisa diakses karena private
          // System.out.println(player1.helth); // tidak bisa juga karena private

        // default class function
        player1.display();

        // public class function
        player1.displayp();

        // private class function
            // player1.displaypr(); tidak bisa diakses karena merupakan sebuah private method

        // ubah health
        player1.ubahHealth(1000);



    }
}
