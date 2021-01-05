package com.tutorial;

public class HeroIntel extends Hero{
    HeroIntel(String name, double defencePower){
        super(name,defencePower);
    }

    HeroIntel(String name){
        super(name);
    }

    void display(){
        System.out.println("Name\t:" + this.name);
    }
}
