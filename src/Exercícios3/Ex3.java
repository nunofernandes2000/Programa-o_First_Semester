package Exercícios3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira algo");
        char num = teclado.next().charAt(0);
        switch (num) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                System.out.println("Algoritmo");break;


        default:
        System.out.println("Isto é uma letra");
        }
    }
    }
