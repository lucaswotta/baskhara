package Eq2g;

import java.lang.Math;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public double calculaXn(Delta x) {
        xn = (-x.getB() - Math.sqrt(x.getDelta())) / (2 * x.getA());
        return xn;
    }

    public double calculaXp(Delta x) {
        xp = (-x.getB() + Math.sqrt(x.getDelta())) / (2 * x.getA());
        return xp;
    }
}
