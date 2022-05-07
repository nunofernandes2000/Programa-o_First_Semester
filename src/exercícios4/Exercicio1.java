package exercícios4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, j, i;
        char car;
        System.out.println("Insira a letra que pretende fazer um quadrado");
        car = teclado.next().charAt(0);
        System.out.println("Insira o numero de lados do quadrado");
        num = teclado.nextInt();
        i = 1;
        j = 1;
        while(i<=num){
            j = 1;
            while(j<=num){
                System.out.print(car+" ");
                j+=1;
            }
            System.out.println("");
            i+=1;
        }
    }
}


