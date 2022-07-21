package Simples;

// Método static com associação

public class Programa2 {

    static double delta(int a, int b, int c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    static double denominador(int a) {
        return 2 * a;
    }

    static double numeradorx1(int a, int b, int c) {
        return -b + Math.sqrt(delta(a, b, c));
    }

    static double numeradorx2(int a, int b, int c) {
        return -b - Math.sqrt(delta(a, b, c));
    }

    static double x1(int a, int b, int c) {
        return numeradorx1(a, b, c) / denominador(a);
    }

    static double x2(int a, int b, int c) {
        return numeradorx2(a, b, c) / denominador(a);
    }

    static void print(int a, int b, int c) {
        if (delta(a, b, c) == 0) {
            System.out.println("x1 = x2 = " + x1(a, b, c));
        }

        else if (delta(a, b, c) != 0 && delta(a,b,c) > 0) {
            System.out.println("x1 = " + x1(a, b, c));
            System.out.println("x2 = " + x2(a, b, c));
        } else {
            System.out.println("Não existe raíz!");
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = -15;
        int c = 12;
        System.out.println("-----a, b, c------");
        print(a,b,c);
        
// Dá pra adicionar mais e reaproveitar código
        int a2 = -12;
        int b2 = 4;
        int c2 = 8;

        System.out.println("----a2, b2, c2----");
        print(a2,b2,c2);
    }
}