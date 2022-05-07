package Exercícios6;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float salario[] = new float[12];
        for (int i=0;i<salario.length;i++){
            System.out.println("Insira o salário do mês "+(i+1));
            salario[i] = teclado.nextFloat();

        }
        for (int i=0;i<salario.length;i++){
            System.out.println(salario[i]+" é o salario do mes "+(i+1));
        }
    }
}
