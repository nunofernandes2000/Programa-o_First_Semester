package Exercícios2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra;
        System.out.println("Intruduz uma letra e nós iremos dar a letra asseguir");
        System.out.println("Letra: ");
        letra = teclado.next().charAt(0);
        if ((letra == 122) || (letra == 90)){
            letra = (char)(letra-25);
            System.out.println(letra);
        }
        else if ((letra >= 65 && letra <= 89) || (letra >= 97 && letra <= 121)){
            letra = (char)(letra+1);
            System.out.println(letra);
        }
        else{
            System.out.println("Intruduza uma letra minuscula ou maiscula -_-");
        }

    }
}
