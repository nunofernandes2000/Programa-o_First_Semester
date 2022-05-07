package exercícios5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int n = 8;
        System.out.println("Este programa imprime 8 numeros aleatórios entre 1 e 100");
        for(;i<n; i++){
            System.out.println((int)(Math.random()*99+1));
        }
    }
}
