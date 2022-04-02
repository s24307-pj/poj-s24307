package com.company;

public class TrojkatRownoboczny extends TrojkatRownoramienny {
    public TrojkatRownoboczny(double podstawa, double ramie) {
        super(podstawa, ramie);
    }

    public TrojkatRownoboczny(double podstawa) {
        super(podstawa);
    }

    public double wysokosc() {
        return 0;
    }
}
