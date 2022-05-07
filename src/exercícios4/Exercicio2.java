package exercícios4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i=1, j=1;
        System.out.println("Insira o numero de linhas que pretende");
        int num = teclado.nextInt();
        System.out.println("Insira o comprimento");
        int comp = teclado.nextInt();

        while(i<=num){
            j=1;
            while(j<=comp){
                System.out.print("* ");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
    }
}
