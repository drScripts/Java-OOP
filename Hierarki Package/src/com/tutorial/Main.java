package com.tutorial;

// mengimport Class Console dan Class Terminal
import com.terminal.*;

// Menginmport Static method dari console
import static com.terminal.Console.print;


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Bambang");
        Player player2 = new Player("Saitama");
        player1.show();
        player2.show();

        Console.log("Player Name = " + player1.getName());
        Terminal.log("Kata Ilham lu Goblok ");
        print();
    }
}
