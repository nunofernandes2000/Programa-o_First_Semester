package T5_Do_While_Myversion;

import java.util.Scanner;

public class Exercicio8SegundasOportunidades {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        float soma = 0;
        int N;
        float idade;
        float media;
        media = 0;
        do{
        System.out.println("Numero de alunos na sala");
        N = teclado.nextInt();
            if(N <= 0) System.out.println("Insere um numero válido");
        }while(N<=0);
            while (i <= N) {
                System.out.println("Idade do Aluno " + i + " ");
                System.out.println("Insira a idade do aluno");
                idade = teclado.nextInt();
                if (idade > 0) {
                    soma += idade;
                    media = soma / N;
                    i++;
                } else {
                    System.out.println("Insere um numero válido");
                }
            }
            System.out.println(media);
        }
        }

