package exercícios5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa faz a tabuada de um numero até ao 10");
        System.out.println("Insira um numero inteiro");
        int i = 0;
        int n = teclado.nextInt();

        for(int t = 0; i<=10 ;i++){
            System.out.println(t);
            t +=n;
        }
    }
}
