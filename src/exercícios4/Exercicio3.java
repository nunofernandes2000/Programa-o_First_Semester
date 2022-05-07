package exercícios4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option, i=0;
        do {
            i += 1;
            System.out.println("Qual o comando para terminar uma instrução switch em Java? Insere o numero correspondente");
            System.out.print("Default = 1");
            System.out.print("Case = 2");
            System.out.print("Else = 3");
            System.out.print("Break = 4");
            System.out.print("Switch = 5");
            System.out.println();
            option = teclado.nextInt();
            if(option >= 1 && option <= 5) {
                switch (option) {
                    case 4:
                        System.out.println("Parabens acertaste"+" á "+i+"ª tentativa");
                        break;
                    default:
                        System.out.println("Erraste");
                        break;
                }
            }
                else{
                    System.out.println("insira uma resposta válida");

            }

        }
        while (option != 4);
    }
}