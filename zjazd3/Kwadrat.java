package com.company;

public class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna,MoznaWyznaczycWielokrotnoscPrzekatnej {
    public Kwadrat(int i) {
        super(i);
    }

    public Kwadrat(int i, int i1) {
        super(i,i1);
    }

    @Override
    public String toString() {
        return "kwadrat";
    }

    @Override
    public double katNachylenia() {
        return Math.PI / 2;
    }

    @Override
    public double bok() {
        return 0;
    }


    @Override
    public double podstawa() {
        return 0;
    }

    @Override
    public double przekatna() {
        return  2 * Math.sqrt(2);
    }

    @Override
    public double wysokosc() {
        return 0;
    }

    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return  Math.sqrt(2);
    }

    @Override
    public int wielokrotnoscPrzekatnej(int x) {
        return 2*(int) Math.sqrt(2);
    }
}
