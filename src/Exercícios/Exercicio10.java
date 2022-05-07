package Exercícios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Comparador de numeros iguais");
        System.out.println("Intruduza o seu primeiro numero");
        double a = teclado.nextDouble();
        System.out.println("Introduza o seu segundo numero");
        double b = teclado.nextDouble();
        System.out.println("Introduza o seu terceiro numero");
        double c = teclado.nextDouble();
        boolean d = a==b && a==c && b==c;
        System.out.println("O que introduziu é "+ d);

    }
}
