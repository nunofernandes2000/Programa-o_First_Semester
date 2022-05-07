package Exercícios3;

import java.util.Scanner;

public class Ex2 {
        public static void main(String[] args) {
            char vogal;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Insira uma letra");
            vogal = teclado.next().charAt(0);
            switch (vogal) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    System.out.println("Vogal Retard");break;
                default:
                    System.out.println("Burro isto é uma consoante volta para o primeiro ano");
            }
        }
}
