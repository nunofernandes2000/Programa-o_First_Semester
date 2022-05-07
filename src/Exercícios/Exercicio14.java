package Exercícios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        System.out.println("Este programa troca as os valores das variáveis(numeros inteiros)");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a varíavel a");
        int a = teclado.nextInt();
        System.out.println("Insira a varíavel b");
        int b = teclado.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("A vale "+a);
        System.out.println("B vale "+b);



    }
}
