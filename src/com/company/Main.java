package com.company;
import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    static double p,l,t,r;

    public static void main(String[] args) {
        int pil;
        System.out.println("");
        do{
            System.out.println("============");
            System.out.println("MENU UTAMA");
            System.out.println("============");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih :" );
            pil = userInput.nextInt();

            switch (pil){
                case 1:
                    balok();
                    break;

                case 2:
                    tabung();
                    break;

                default:
                    System.out.println("Input yang anda masukan salah!!");
            }
        }while (pil>=1);

    }
    public static void balok(){
        System.out.print("Input Panjang : " );
        p = userInput.nextDouble();
        System.out.print("Input Lebar : ");
        l = userInput.nextDouble();
        System.out.print("Input Tinggi : ");
        t = userInput.nextDouble();

        Balok balok = new Balok(p,l,t);
        balok.display();
    }

    public static void tabung(){
        System.out.print("Input Jari-Jari : ");
        r = userInput.nextDouble();
        System.out.print("Input Tinggi : ");
        t = userInput.nextDouble();

        Tabung tabung = new Tabung(r,t);
        tabung.display();
    }
}
