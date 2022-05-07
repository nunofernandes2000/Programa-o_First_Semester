package Exercícios;

import java.util.Scanner;
//Elabore um programa em Java que pede o nome do utilizador e o seu ano de nascimento
//e emite uma mensagem de boas vindas usando o nome do utilizador, indicando de
//seguida a idade do utilizador;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o teu ano de nascimento");
        int datanascimento = teclado.nextInt();
        System.out.println("Qual o teu nome?");
        String nome = teclado.nextLine();
        int anos = 2021 - datanascimento;
        System.out.println("O teu user name é " +nome+ " e tens " +anos+ " anos!");

    }

}
