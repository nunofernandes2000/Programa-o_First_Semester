package T2_IO;

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Comparador de numeros iguais");
        System.out.println("Intruduza o seu primeiro numero");
        double a = teclado.nextDouble();
        System.out.println("Introduza o seu segundo numero");
        double b = teclado.nextDouble();
        boolean c = a==b;
        System.out.println("O que introduziu é "+ c);
    }
}
