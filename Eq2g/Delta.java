package Eq2g;

import java.lang.Math;

public class Delta extends Equacao {
    private double delta;

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public void calculaDelta() {
        delta = (Math.pow(super.getB(), 2) - (4 * super.getA() * super.getC()));
    }

    public void validaEq() {
        if (super.getA() == 0) {
            System.out.println(System.lineSeparator() + "'A' não pode ter valor de '0'");
            System.out.println("Não se trata mais de uma Eq2g" + System.lineSeparator());
            System.out.println("Execute o programa novamente!");
            System.exit(0);
        }
    }

    public void validaDelta() {
        if (delta <= 0) {
            System.err.println("O Delta é Negativo!");
            System.exit(404);
        }
    }
}