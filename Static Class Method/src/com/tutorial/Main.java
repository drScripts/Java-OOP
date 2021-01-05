package com.tutorial;
import java.util.ArrayList;


class Player{
    private static int numOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name){
        this.name = name;
        Player.numOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Your name : " + this.name);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }

    static void showNumberOfPlayer(){
        System.out.println("Jumlah player : "  + numOfPlayer);
    }

}



public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("ucup");
        Player player2 = new Player("udin");
        Player player3 = new Player("bambang");
        Player player4 = new Player("marko");

        // System.out.println("Num player : "  + Player.numOfPlayer);
        Player.showNumberOfPlayer();
        for (String name:Player.getNames()) {
            System.out.println("Name\t : " + name);
        }


    }
}
