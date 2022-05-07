package Exercícios3Primeiratentativa;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intruduza uma letra");
        char letra = teclado.next().charAt(0);
        switch(letra){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            System.out.println("Vogal");break;
            default:
                System.out.println("Não é vogal");
        }
        teclado.close();
    }
}
