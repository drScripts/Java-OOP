package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 11;
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //setter
    public void setDoublePrivate(int intPrivates){
        this.doublePrivate = intPrivates;
    }

    // display all
    void display(){
        System.out.println("Integer Private : " + this.intPrivate);
        System.out.println("Double Private  : " + this.doublePrivate);
        System.out.println();
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    public double getJari2(){
        return this.diameter/2;
    }

    public double getLuas(){
        return 3.14 * diameter * diameter/4;
    }
}

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        // public
        data.intPublic += 10; // Write
        System.out.println("Public : " + data.intPublic); // Read

        // readOnly bagian private method menggunakan Getter
        System.out.println("Getter : " + data.getIntPrivate());

        // display all
        data.display();

        // Write Only
        data.setDoublePrivate(100);

        // DIsplay all
        data.display();

        // gabungkan read and write dengan getter dan setter
        Lingkaran lingkaran1 = new Lingkaran(5);
        System.out.println("Jari - Jari : " + lingkaran1.getJari2());
        System.out.println();

        lingkaran1.setJari2(14);
        System.out.println("Jari - Jari : " + lingkaran1.getJari2());
        System.out.println();

        lingkaran1.setJari2(7);
        System.out.println("Jari - Jari : " + lingkaran1.getJari2());
        System.out.println("LUas        : " + lingkaran1.getLuas());
    }
}
