package com.tutorial;
import com.terminal.Console;
// visibility class default

class Player {
    private String name;

    Player(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        Console.log("====== Menggunakan Class Console ======");
        Console.log("Player Name : " + this.name);
    }

}

