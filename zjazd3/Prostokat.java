package com.company;

public class Prostokat implements MoznaWyznaczycPrzekatna, MoznaWyznaczycWysokosc, MoznaWyznaczycWielokrotnoscPrzekatnej {
    public Prostokat(int i, int i1) {
    }

    public Prostokat(int i) {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "prostokat";
    }

    public double katNachylenia() {
        return Math.PI / 2;
    }

    public double bok() {
        return 0;
    }

    @Override
    public double podstawa() {
        return 0;
    }

    @Override
    public double przekatna() {
        return Math.sqrt((1 * 1) + (2 * 2));
    }

    @Override
    public double wysokosc() {
        return 0;
    }

    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return Math.sqrt((1 * 1) + (2 * 2));
    }
    @Override
    public int wielokrotnoscPrzekatnej(int x) {
        return (int) Math.sqrt(2);
    }

}
