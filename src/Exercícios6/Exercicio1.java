package Exercícios6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Este programa guarda os nomes dos alunos presentes na sala e imprime de forma inversa esses mesmos");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos alunos existe na sala?");
        int numero = teclado.nextInt();
        String nome[] = new String[numero];
        for (int i = 0; i < numero; i++) {
            System.out.println("Qual o nome do aluno " + (i + 1) + "?");
            nome[i] = teclado.next();
        }
        for (int i = numero - 1; i >= 0; i--) {
            System.out.println("\n"+nome[i]);
        }
    }
}
