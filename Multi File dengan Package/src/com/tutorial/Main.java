package com.tutorial;
import com.terminal.Terminal;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("ucup");
        Player player2 = new Player("otong");
        Player player3 = new Player("Bambang");
        player1.show();
        player2.show();
        player3.show();

        Terminal.log("Bambang kau siah gila");

    }
}
