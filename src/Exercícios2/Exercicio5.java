package Exercícios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(". Programa que lê um número entre 1 e 7 indicado pelo utilizador e escreve o nome do dia de semana respetivo");
        int a = teclado.nextInt();
        if (a<=0) {
            System.out.println("Introduza um valor válido");
        }
            else if (a == 1){
                System.out.println("O numero que introduziu corrensponde á segunda feira");
            }
        else if (a == 2){
            System.out.println("O numero que introduziu corrensponde á terça feira");
        }
        else if (a == 3){
            System.out.println("O numero que introduziu corrensponde á quarta feira");
        }
        else if (a == 4){
            System.out.println("O numero que introduziu corrensponde á quinta feira");
        }
        else if (a == 5){
            System.out.println("O numero que introduziu corrensponde á sexta feira");
        }
        else if (a == 6){
            System.out.println("O numero que introduziu corrensponde ao sábado");
        }
        else if (a == 7){
            System.out.println("O numero que introduziu corrensponde ao domingo");
        }
        else{
            System.out.println("Introduza um valor válido");
        }



    }
}
