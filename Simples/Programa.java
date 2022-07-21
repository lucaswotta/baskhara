package Simples;

// Método if else simplificado
public class Programa {
    public static void main(String[] args) {

        int a = -12;
        int b = 4;
        int c = 8;
        double delta = Math.pow(b, 2) - (4 * a * c);
        double denominador = 2 * a;
        double numeradorx1 = -b + Math.sqrt(delta);
        double numeradorx2 = -b - Math.sqrt(delta);
        double x1 = numeradorx1 / denominador;
        double x2 = numeradorx2 / denominador;

        if (delta == 0) {
                System.out.println("X1 = X2 = " +String.format("%.2f", x1));
        }else if (delta!=0 && delta>0) {
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
        }
        else {
            System.out.println("Não existe raízes!");
        }
    }
}