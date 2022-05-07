package Exercícios7;

import java.util.Scanner;

public class Exercicio6b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a nota do trabalho 1");
        int t1 = teclado.nextInt();
        System.out.println("Qual a nota do trabalho 2");
        int t2 = teclado.nextInt();
        avalia(t1,t2);
    }
    public static void avalia(int t1, int t2){
        double t3;
        t3 = (t1 + t2)/2;
        if(t3>=10 && t3<=20) {
            System.out.println("Aprovado");
        }
        else if (t3<10 && t3>=0){
            System.out.println("Reprovado");
        }
        else
            System.out.println("Valores Inválidos");
    }
}
