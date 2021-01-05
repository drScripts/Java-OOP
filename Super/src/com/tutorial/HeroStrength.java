package com.tutorial;

public class HeroStrength extends Hero{
//    String name = "Class Strength";

    void show(){
        System.out.println("ini adalah\t: " + this.name);
        this.dummyMethod();
    }

    void showSuper(){
        System.out.println("ini adalah\t: " + super.name);
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("method ini ada di sub class");
    }
}
