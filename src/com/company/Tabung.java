package com.company;

public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double vol() {
        return 2* Math.PI * getJari() * getJari();
    }

    @Override
    public double luasPermukaan() {
        return (2* Math.PI * getJari() * tinggi) + (2* Math.PI * getJari() * getJari()) ;
    }

    public void display(){
        System.out.println("luas Persegi Panjang : " + luas());
        System.out.println("Keliling Persegi Panjang : "+ kelilingBidang());
        System.out.println("Volume Balok : " + vol());
        System.out.println("Luas Permukaan Balok : "+ luasPermukaan());
    }
}
