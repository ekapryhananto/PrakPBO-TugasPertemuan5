/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

/**
 *
 * @author Eka Pryhananto
 */
public class Balok implements MenghitungRuang{

    private double p, l, t;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    
    @Override
    public double luas() {
        return 2*(p*l + p*t + l*t);
    }

    @Override
    public double volume() {
        return p*l*t;
    }
    
}
