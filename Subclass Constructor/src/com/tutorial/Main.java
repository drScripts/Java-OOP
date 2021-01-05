package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("bambang",100);
        hero1.display();

        System.out.println();

        HeroIntel hero2 = new HeroIntel("ucup",50);
        hero2.display();

        HeroIntel hero3 = new HeroIntel("esmeralda");
        hero3.display();
    }
}
