package Exercícios2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa que recebe a velocidade do vento e lança um alerta no caso de se tratar de um furacão");
        int a = teclado.nextInt();
        if (a <=118) {
            System.out.println("Não existe risco");
        }
            else if( a >= 119 && a <= 153){
            System.out.println("Furacão de nível 1");
        }
        else if( a >= 154 && a <= 177){
            System.out.println("Furacão de nível 2");
        }
        else if( a >= 178 && a <= 210){
            System.out.println("Furacão de nível 3");
        }
        else if( a >= 211 && a < 249){
            System.out.println("Furacão de nível 4");
        }
        else if( a >= 249){
            System.out.println("Furacão de nível 5");
        }
        else {
            System.out.println("Erro");
        }
    }
}
