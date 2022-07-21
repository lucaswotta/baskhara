package Aplicacao;

import java.lang.Math;

public class Formula {
    private int a;
    private int b;
    private int c;

    public Formula(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //#Fórmula de Bhaskara

    public double delta() {
        return Math.pow(b, 2) - (4 * a * c);
    }
    public double denominador() {
        return 2 * a;
    }
    public double numeradorx1() {
        return -b + Math.sqrt(delta());
    }
    public double numeradorx2() {
        return -b - Math.sqrt(delta());
    }
    public double x1() {
        return numeradorx1() / denominador();
    }
    public double x2() {
        return numeradorx2() / denominador();
    }

    //#if e else

    public void print() {
        if (delta() == 0) {
            System.out.println("X1 = X2 = " +String.format("%.2f", x1()));
        } else if (delta() != 0 && delta() > 0) {
            System.out.println(" X1 : "+String.format("%.2f", x1()));
            System.out.println(" X2 : "+String.format("%.2f", x2()));
        } else {
            System.out.println("Raíz Inexistente!");
        }
    }

    //#Getters e Setters

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
}