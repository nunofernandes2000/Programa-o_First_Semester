package Exercícios2;

import java.util.Scanner;

public class Exercicio7 {
        public static void main(String[] args) {
            double c;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Bem vindo este programa indicará a sua massa corporal");
            System.out.println("Insere a tua altura em metros utilizando a virgula como casa decimal");
            double a = teclado.nextDouble();
            System.out.println("Insere a tua altura em kilogramas utilizando a virgula como casa decimal");
            double b = teclado.nextDouble();
            c = b/(a*a);
            System.out.println("A sua massa corporal é " +c);
            if (c < 18.5){
                System.out.println("O seu indice de massa corporal indica que é magro");
            }
            else if (c == 18.5 || c < 25){
                System.out.println("O seu indice de massa corporal indica que é saudável");
            }
            else if (c == 25 || c < 30){
                System.out.println("O seu indice de massa corporal indica que está risco de obesidade");
            }
            else if (c >= 30){
                System.out.println("O seu indice de massa corporal indica que é obeso");
            }
            else{
                System.out.println("Erro");
            }
        }
    }