package Exercícios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo este programa indicará a sua massa corporal");
        System.out.println("Insere a tua altura em metros utilizando a virgula como casa decimal");
        double a = teclado.nextDouble();
        System.out.println("Insere a tua altura em kilogramas utilizando a virgula como casa decimal");
        double b = teclado.nextDouble();
        System.out.println("O teu indíce de massa corporal é " + b/(Math.pow(a, 2)));
    }
}


