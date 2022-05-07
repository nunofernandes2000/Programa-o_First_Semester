package Exercícios;

import java.util.Scanner;

//Elabore um programa que pede ao utilizador o seu nome e desporto preferidos e que
//escreve uma mensagem com essa informação. Utilize os dois métodos que aprendeu para
//entrada de dados.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o teu nome(primeiro e ultimo)?");
       String nome = teclado.nextLine();
        System.out.println("Qual o teu desporto favorito " + nome+ "?");
    String desporto = teclado.nextLine();
        System.out.println("O teu nome é " +nome+ " e o teu desporto favorito é " +desporto);
    }
}
