package com.tutorial;

// player

class Player{
    String nama;
    double health;
    // int level;

    //object member
    Weapon weapon;
    Armor armor;

    // constructor
    Player(String nama, double health){
        this.nama = nama;
        this.health = health;
    }

    void attack(Player opponent){
        System.out.println(this.nama + " attacking " + opponent.nama +  ".... (" + this.weapon.attackPower + ")" );
        defence(opponent.nama,opponent.armor.defencePower,opponent.health);
    }

    void defence(String nama,double defencePower,double health){
        // mengambil damage
        // kalau attack power > defendcepower, maka damage = defence power - attack power

        double damage;
        if(this.weapon.attackPower > defencePower){
            damage = this.weapon.attackPower - defencePower;
            health -= damage;
        }else{
            damage = 0;
        }

        System.out.println(nama + " got damaged " + damage);
        System.out.println(nama + " health = " + health + " hp");
    }

    // untuk mengequip weapon
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void displayStatus(){
        System.out.println("Hello, " + this.nama + " welcome to the game");
        System.out.println("Your health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
        System.out.println();
    }


}

// senjata

class Weapon{
    double attackPower;
    String name;

    // constructor
    Weapon(String name,double attackPower){
        this.attackPower = attackPower;
        this.name = name;
    }

    void display(){
        System.out.println("Your weapon : " + this.name + " ( Attack power : " + this.attackPower + ")" );
    }

}

// armor
class Armor{
    double defencePower;
    String name;

    // constructor
    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Your armor : " + this.name + " (defence power : " + this.defencePower + ")");
    }

}

public class Main {
    public static void main(String[] args) {
        // membuat object player
        Player player1 = new Player("Udin",100);
        Player player2 = new Player("ucup",100);

        // membuat object weapon
        Weapon ak47 = new Weapon("AK-47",65);
        Weapon pedang = new Weapon("Katana",10);

        // membuat object armor
        Armor shield = new Armor("Army Body Armor",50);
        Armor PASGT = new Armor("PASGT",55);

        // equip senjata dan armor
        player1.equipWeapon(ak47);
        player2.equipWeapon(pedang);
        // armor
        player1.equipArmor(shield);
        player2.equipArmor(PASGT);

        player1.displayStatus();
        player2.displayStatus();

        // Attakcing
        System.out.println("====== Attacking ======");
        player1.attack(player2);
        System.out.println();
        // Attacking
        System.out.println("====== Attacking ======");
        player2.attack(player1);


    }
}
