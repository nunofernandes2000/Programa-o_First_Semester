package Exercícios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Calcula area de um retangulo");

        Scanner teclado = new Scanner(System.in);
        int lado1ret1 = 7;
        int lado2ret1 = 8;
        double lado1ret2 = 3.6;
        double lado2ret2 = 9.1;
        int ret1 = lado1ret1 * lado2ret1;
        double ret2 = lado1ret2 * lado2ret2;
        System.out.println("Insira os 2 lados do retangulo que pretende calcular a área");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        System.out.println("O primeiro rentangulo têem "+ret1+ " de área");
        System.out.println("O segundo rentangulo têem "+ret2+ " de área");
        System.out.println("o retangulo inserido pelo o utilizador têem " +a*b+ " de área" );

    }
}
