package com.tutorial;

class Player{
    private String name;

    private int baseHealth;
    private int level;
    private int encrementHealth;
    private int baseAttack;
    private int encrementAttack;
    private int totalDamage;
    private Boolean isAlive;
    // object member
    private Armor armor;
    private Weapon weapon;



    Player(String name){
        this.level = 0;
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.encrementHealth = 20;
        this.encrementAttack = 20;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }

    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.baseHealth);
        System.out.println("Attack\t\t: " + this.baseAttack);
        System.out.println("Alive\t\t: " + this.isAlive);
        System.out.println("====== Equipment " +  this.name + " ======");
        System.out.println("Armor\t\t: " + this.armor.getName());
        System.out.println("Health\t\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Weapon\t\t: " + this.weapon.getName());
        System.out.println("Max Attack\t: " + this.getAttackPower());
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public int maxHealth(){
        return this.baseHealth + this.armor.gettAddHealth() + this.encrementHealth * this.level;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    private int getAttackPower(){
        return this.baseAttack + this.level * this.encrementAttack + this.weapon.getAttack();
    }

    private void levelUp(){
        System.out.println("\n" + this.name + " Was Level Up....");
        this.level += 1;
    }

    public void attack(Player opponent){
        System.out.println("====== " + this.name + " Attacking " + opponent.getName() + " ======");
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println("Player\t\t: " + this.name + ", attacking "+ opponent.getName() +" : " +  damage);
        // attack opponent
        opponent.defends(damage);
        this.levelUp();
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void defends(int damage){
        // receive damage

        int defencePower = this.armor.getDefendsPower();
        int deltaDamage;
        System.out.println(this.name + " defence power : " + defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        }else{
            deltaDamage = 0;
        }

        System.out.println("Damage Earned = " + deltaDamage);
        // adding total damage

        this.totalDamage+=deltaDamage;

        // check is alive

        if(this.getHealth() <= 0 ){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        System.out.println();

    }

}

class Weapon{
    private String name;
    private int attack;

    Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }

    public String getName(){
        return this.name;
    }
}

class Armor{
    private String name;
    private int strength;
    private int addHealth;

    Armor(String name, int strength, int Health){
        this.name = name;
        this.strength = strength;
        this.addHealth = Health;
    }

    public int gettAddHealth() {
        return this.strength * 10 + this.addHealth;
    }

    public String getName(){
        return this.name;
    }

    public int getDefendsPower() {
        return this.strength * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Layla");
        Armor armor1 = new Armor("baju besi", 5,100);
        Weapon weapon1 = new Weapon("AK-47",10);
        player1.setWeapon(weapon1);
        player1.setArmor(armor1);

        System.out.println();

        Player player2 = new Player("Bambang");
        Armor armor2 = new Armor("SWAT Shield", 1,40);
        Weapon weapon2 = new Weapon("mini SMG",40);
        player2.setWeapon(weapon2);
        player2.setArmor(armor2);

        player1.display();
        System.out.println();
        player2.display();

        System.out.println();
        player1.attack(player2);

        player1.display();
        System.out.println();
        player2.display();

        System.out.println();
        player2.attack(player1);

        player1.display();
        System.out.println();
        player2.display();
        System.out.println();
        player2.attack(player1);

        player1.display();
        System.out.println();
        player2.display();
    }
}
