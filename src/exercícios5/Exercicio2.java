package exercícios5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa dívide numeros inteiros e escreve todos os numeros pares");
        System.out.println("Insira um numero inteiro");
        int i = 0;
        int n = teclado.nextInt();
        if(n%2==0){
            System.out.println(n);
            for(;n>0;){
                n -= 2;
                System.out.println(n);
            }
        }
        else{
            System.out.println(n);
            n= n-1;
            System.out.println(n);
            for (;n>0;){
                n -= 2;
                System.out.println(n);
            }
        }
    }
}
