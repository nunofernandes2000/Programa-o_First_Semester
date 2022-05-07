package Exercícios;

import java.util.Scanner;

public class Exercicio6_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo este programa converte euros para libras");
        System.out.println("Insira quantas euros quer converter para libras");
        Double euros = teclado.nextDouble();
        Double a = 0.85;
        System.out.println("Inseriu " +euros+ " euros" + " que equivale a " + euros*a + " libras" );
    }
}

