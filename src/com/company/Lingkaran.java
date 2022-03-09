package com.company;

public class Lingkaran implements MenghitungBidang{
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double luas() {
        return 0;
    }

    @Override
    public double kelilingBidang() {
        return 0;
    }
}
