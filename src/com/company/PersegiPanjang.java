package com.company;

public class PersegiPanjang implements MenghitungBidang{
    private double panjang,lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang*lebar;
    }


    @Override
    public double kelilingBidang() {
        return 2*(panjang+lebar);
    }
}
