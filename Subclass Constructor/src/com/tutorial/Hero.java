package com.tutorial;

public class Hero {
    String name;
    double defenePower;
    //constructor
    Hero(String name, double defenePower){
        this.name = name;
        this.defenePower = defenePower;
    }

    Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name\t: " + this.name);
        System.out.println(this.name + " has defence power : " + this.defenePower);
    }


}
