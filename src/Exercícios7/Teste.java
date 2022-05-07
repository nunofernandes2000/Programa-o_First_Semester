package Exercícios7;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa recebe 2 números inteiros, escrevendo depois todos os números entre esses 2 inteiros");
        System.out.println("Insira o Numero 1");
        int n1 = teclado.nextInt();
        System.out.println("Insira o Numero 2");
        int n2 = teclado.nextInt();
        Programa(n1,n2);
    }
    public static void Programa(int n1, int n2){
        for(int i = n1+1;i<n2;i++){
            System.out.print(" "+i);
    }
    }
}
