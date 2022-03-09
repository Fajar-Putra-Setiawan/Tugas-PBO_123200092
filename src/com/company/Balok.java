package com.company;

public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
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
        return getPanjang()*getLebar()*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*(getPanjang()*getLebar()+getPanjang()*tinggi+tinggi*getLebar());
    }

    public void display(){
        System.out.println("luas Persegi Panjang : " + luas());
        System.out.println("Keliling Persegi Panjang : "+ kelilingBidang());
        System.out.println("Volume Balok : " + vol());
        System.out.println("Luas Permukaan Balok : "+ luasPermukaan());
    }

}
