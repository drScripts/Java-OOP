package com.tutorial;

public class HeroStrength extends Hero{
    double defencePower;

    // overiding
    void show(){
        System.out.println("====== Hero Strength ======");
        System.out.println("Hero Name\t\t\t: "+ this.name);
        System.out.println("Hero Defence Power\t: " + this.defencePower);
    }
}
