package com.tutorial;

class Display{
    static String type = "Display";
    private String name;

    Display(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Nama\t:" + this.name);
    }

    void setType1(String typeInput){
        // alternatif 1
        type = typeInput;
    }

    void setType2(String type){
        // bisa tapi ga gini
            // this.type = type;
        // yang bener
        Display.type = type;
    }
}


public class Main {
    public static void main(String[] args) {
        Display nama = new Display("udin");
        nama.show();

        Display monitor = new Display("monitor");
        monitor.show();

        // mengganti variable static
        // Display.type = "udins";
        monitor.setType1("mantap");
        monitor.setType2("bambangs");
        // tampilkan static variable
        System.out.println("Static Var 1 = " + nama.type);
        System.out.println("Static Var 2 = " + monitor.type);

        // kita dapat mengakes variable static dengan hanya memanggil nama class dengan nama variablenya
        // itu karena static variable akan menempel bersama classnya

        System.out.println("Static var dengan class = " + Display.type);
    }
}
