package Aplicacao;

import java.util.Scanner;

public class app {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o valor de A : ");
        int a = entrada.nextInt();
        System.out.println("Digite o valor de B : ");
        int b = entrada.nextInt();
        System.out.println("Digite o valor de C : ");
        int c = entrada.nextInt();

        Formula imprime = new Formula(a, b, c);
        System.out.println("-----------------------");
        imprime.print();
    }
}