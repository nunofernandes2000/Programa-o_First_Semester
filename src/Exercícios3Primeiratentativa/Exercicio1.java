package Exercícios3Primeiratentativa;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intruduz um numero inteiro");
        int numero = teclado.nextInt();
        switch(numero){
            case 1: System.out.println("Um");break;
            case 2: System.out.println("Dois");break;
            case 3: System.out.println("Três");break;
            case 4: System.out.println("Quatro");break;
            case 5: System.out.println("Cinco");break;
            case 6: System.out.println("Seis");break;
            case 7: System.out.println("Sete");break;
            case 8: System.out.println("Oito");break;
            case 9: System.out.println("Nove");break;
            case 0: System.out.println("Zero");break;
            default: System.out.println("Sowwy i cant read uwu:)");
        }

    }
}
