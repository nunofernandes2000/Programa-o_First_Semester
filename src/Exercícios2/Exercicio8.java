package Exercícios2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        System.out.println("Este programa faz uma conta aritemética");
        Scanner teclado = new Scanner(System.in);
        int a, c;
        char b;
        System.out.println("Introduza os numeros");
        a = teclado.nextInt();
        b = teclado.next().charAt(0);
        c = teclado.nextInt();
        if (b == '*'){
            System.out.println(a*c);
        }
        else if (b == '/'){
            System.out.println(a/c);
        }
        else if (b == '-'){
            System.out.println(a-c);
        }
        else if (b == '+'){
            System.out.println(a+c);
        }
        else{
            System.out.println("Erro");
        }
    }
}
