package Exercícios;

import java.util.Scanner;

//Elabore um programa que converte para libras esterlinas uma quantia em euros indicada
//pelo utilizador.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo este programa converte libras esterlinas para euros");
        System.out.println("Insira quantas libras quer converter para euro");
        Double libras = teclado.nextDouble();
        Double a = 1.18;
        System.out.println("Inseriu " +libras+ " libras" + " que equivale a " + libras*a + " euros" );
    }
}
