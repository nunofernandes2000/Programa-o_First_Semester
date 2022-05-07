package Exercícios;

import java.awt.*;
import java.util.Scanner;

//Elabore um programa em Java que pede ao utilizador o seu peso (em Kg) e a sua altura
//(em m) e informa o utilizador do seu Índice de Massa Corporal (IMC). O IMC é igual ao
//peso a dividir pelo quadrado da altura.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo este programa indicará a sua massa corporal");
        System.out.println("Insere a tua altura em metros utilizando a virgula como casa decimal");
         double a = teclado.nextDouble();
        System.out.println("Insere a tua altura em kilogramas utilizando a virgula como casa decimal");
        double b = teclado.nextDouble();
        System.out.println("O teu indíce de massa corporal é " + b/(a*a));
    }
}
