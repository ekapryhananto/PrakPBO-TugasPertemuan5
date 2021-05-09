/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Eka Pryhananto
 */
public class Persegi implements MenghitungBidang{

    private double p, l;

    public double getP() {
        return p;
    }

    public double getL() {
        return l;
    }


    public void setP(double p) {
        this.p = p;
    }

    public void setL(double l) {
        this.l = l;
    }
    
    
    @Override
    public double luas() {
        return p*l;
    }
    
    @Override
    public double keliling() {
        return 2*(p + l);
    }
    
    
}
