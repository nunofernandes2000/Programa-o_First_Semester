package exercícios5;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fat=10, resultado = 1;
        while(!(fat <= 8 && fat >= -8)) {
            System.out.println("\nEste prgrama calcula o farorial até 8");
            System.out.println("\nPretende fazer o faturial de que numero?");
            fat = teclado.nextInt();

            if (fat <= 8 && fat >= 1) {

                for (int num = fat; num > 1; num -= 1) {
                    resultado = num * resultado;

                }
                System.out.println(resultado);
                //Não fazer esta volta toda para a proxima
                /*if (fat >= 3 || fat <= -3) {
                    resultado = (resultado * resultado) / resultado;
                    System.out.println("O fatorial de " + fat + " é: " + resultado);
                } else if (fat == 2 || fat == -2) {
                    System.out.println("2");
                } else if (fat == 1 || fat == -1 || fat == 0) {
                    System.out.println("1");
                }
            } else {
                System.out.println("\nIntruduza um numero válido");*/
            }
        }
    }
}
