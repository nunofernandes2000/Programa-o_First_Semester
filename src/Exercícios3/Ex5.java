package Exercícios3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double num1, num2;
        int op;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intrudza 1 para somar 2 para multiplicar 3 para dividir");
        op = teclado.nextInt();
        System.out.println("Intruza os 2 numeros que pretende fazer uma operação matematica");
        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();
        switch (op){
            case 1:
                System.out.println(num1+num2);break;
            case 2:
                System.out.println(num1*num2);break;
            case 3:
                System.out.println(num1/num2);break;
            default:
                System.out.println("Intruza uma operação válida");


        }
    }
}
