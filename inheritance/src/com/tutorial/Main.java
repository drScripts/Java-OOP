package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "udin";
        hero1.show();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Otong";
        hero2.show();

        HeroIntel hero3 = new HeroIntel();
        hero3.name = "Michael Jordan";
        hero3.show();
    }
}
