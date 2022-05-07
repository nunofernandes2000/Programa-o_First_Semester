package Exercícios2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("Este programa que lê um mês indicado pelo utilizador e diz o número de dias do mês. Suponha que o ano é 2021 (ano comum). ");
        Scanner teclado =  new Scanner(System.in);
        int a = teclado.nextInt();
        if (a == 1){
            System.out.println("Este mês corresponde a janeiro e têem 31 dias");
        }
        else if (a == 2){
            System.out.println("Este mês corresponde a fevereiro e têem 28 dias");
        }
        else if (a == 3){
            System.out.println("Este mês corresponde a março e têem 31 dias");
        }
        else if (a == 4){
            System.out.println("Este mês corresponde a abril e têem 30 dias");
        }
        else if (a == 5){
            System.out.println("Este mês corresponde a maio e têem 31 dias");
        }
        else if (a == 6){
            System.out.println("Este mês corresponde a junho e têem 30 dias");
        }
        else if (a == 7){
            System.out.println("Este mês corresponde a julho e têem 31 dias");
        }
        else if (a == 8){
            System.out.println("Este mês corresponde a agosto e têem 31 dias");
        }
        else if (a == 9){
            System.out.println("Este mês corresponde a setembro e têem 30 dias");
        }
        else if (a == 10){
            System.out.println("Este mês corresponde a outubro e têem 31 dias");
        }
        else if (a == 11){
            System.out.println("Este mês corresponde a novembro e têem 30 dias");
        }
        else if (a == 12){
            System.out.println("Este mês corresponde a dezembro e têem 31 dias");
        }
        else{
            System.out.println("Introduza um numero válido");
        }


    }


}
