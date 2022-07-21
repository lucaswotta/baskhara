package Eq2g;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            Delta delta = new Delta();
            EqXn s = new EqXn();

            System.out.println("---------------------------------------------");
            System.out.println("Software para execução de equações de 2° grau");
            System.out.println("---------------------------------------------");
            System.out.println("Digite o valor de A: ");
            delta.setA(in.nextDouble());
            delta.validaEq();
            System.out.println("Digite o valor de B: ");
            delta.setB(in.nextDouble());
            System.out.println("Digite o valor de C: ");
            delta.setC(in.nextDouble());
            delta.calculaDelta();
            System.out.println("------------ Resultado da Equação -----------");
            System.out.println("Delta: " + delta.getDelta());
            delta.validaDelta();
            System.out.println("X¹ : " + s.calculaXn(delta));
            System.out.println("X² : " + s.calculaXp(delta));
        }
    }
}