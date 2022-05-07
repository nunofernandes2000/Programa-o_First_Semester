package Exercícios3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a Nota do aluno");
        int nota = teclado.nextInt();
        switch(nota){
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                System.out.println("F");break;
            case 13, 14:
                System.out.println("D");break;
            case 15, 16:
                System.out.println("C");break;
            case 17, 18:
                System.out.println("B");break;
            case 19, 20:
                System.out.println("A");break;
            default:
                System.out.println("Valor desconhecido");
        }
    }
}
