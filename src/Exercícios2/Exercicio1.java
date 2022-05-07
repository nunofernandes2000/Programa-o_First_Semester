package Exercícios2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Este programa lê um valor inteiro e diz se é par ou ímpar"+"\n");
        System.out.println("Introduza um numero inteiro"+"\n");
        int pi;
        pi = keyboard.nextInt();
        if(pi%2==0) {
            System.out.println("Este numero é par");
        }
        else if (pi%2==1){
            System.out.println("Este numero é impar");
        }
        else if (pi%2==-1){
            System.out.println("Este numero é impar");
        }
        else{
            System.out.println("Introduza um numero inválido");
        }
    }
}
