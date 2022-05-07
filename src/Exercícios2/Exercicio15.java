package Exercícios2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o ano que escolheu?");
        int ano = teclado.nextInt();
        if((ano%4==0) && (ano%100!=0) || (ano%400==0)){
            System.out.println("Este ano é bissexto");
        }
        else{
            System.out.println("Este ano é comum");
        }
    }
}
