package Exercícios3Primeiratentativa;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Insira um algoritmo");
        char algo = teclado.next().charAt(0);
        switch(algo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println("é algoritmo");break;
            default:
                System.out.println("Não é retard -_-\uD83E\uDD2C \uD83E\uDD2C");
        }
    }
}
