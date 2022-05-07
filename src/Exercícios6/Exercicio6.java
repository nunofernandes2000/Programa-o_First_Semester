package Exercícios6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10];
        for (int i = 0;i<15;i++){
            System.out.println("Insira o numero numa posição "+(i));
            int A = teclado.nextInt();
            numeros[A]++;
        }
        for(int i = 0;i<numeros.length;i++){
            System.out.println(numeros[i]+" Posição"+(i));
            //depois meter if para excluir repetidos
        }
        }
    }

