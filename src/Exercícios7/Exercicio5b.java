package Exercícios7;

import java.util.Scanner;

public class Exercicio5b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos alunos são?");
        int alunos = teclado.nextInt();
        for (int i = 0; i < alunos; i++) {
            System.out.println("Insira a Nota do aluno");
            int nota = teclado.nextInt();
            System.out.println(notas(nota));
        }

    }
    public static char notas (int nota){
        char notaletra = 'O';
        switch (nota) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                notaletra = 'F';
                break;
            case 13, 14:
                notaletra = 'D';
                break;
            case 15, 16:
                notaletra = 'C';
                break;
            case 17, 18:
                notaletra = 'B';
                break;
            case 19, 20:
                notaletra = 'A';
                break;
            default:
                System.out.println("Valor desconhecido");
                notaletra = 'O';
        }
            return notaletra;
    }
}

