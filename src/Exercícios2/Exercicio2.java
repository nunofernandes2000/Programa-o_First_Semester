package Exercícios2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double a, b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Este programa que lê dois valores indicados pelo utilizador e diz qual é o valor mínimo, ou, sendo iguais, indica isso mesmo");
        System.out.println("Introduza primeiro o valor de A e depois o de B");
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        if(a>b) {
            System.out.println(a + " que é o valor de A é maior que o valor de B que equivale a " + b);
        }
            else if(b>a){
            System.out.println(b + " que é o valor de B é maior que o valor de A que equivale a " + a);
            }
            else{
            System.out.println(b + " que é o valor de B é igual ao valor A que é equivale a " + a);
        }
        }
    }

