package Exercícios7;

import java.util.Scanner;

public class Exercicio6a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a nota do trabalho 1");
        int t1 = teclado.nextInt();
        System.out.println("Qual a nota do trabalho 2");
        int t2 = teclado.nextInt();
        System.out.println(avalia(t1,t2));

    }
    public static String avalia(int t1, int t2){
        int t3 = (t1+t2)/2;
         String avalia = " ";
        if(t3>=10 && t3<=20) {
            avalia = "Aprovado";
        }
            else if (t3<10 && t3>=0){
                avalia = "Reprovado";
            }
            else
            avalia = "Valores Inválidos";
            return avalia;
    }
}
