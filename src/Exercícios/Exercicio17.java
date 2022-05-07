package Exercícios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        System.out.println("Este Programa calcula a nota final de um aluno");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a nota do primeiro trabalho");
        double a = teclado.nextDouble();
        a = a * 0.2;
        System.out.println("Insira a nota do segundo trabalho");
        double b = teclado.nextDouble();
        b = b * 0.5;
        System.out.println("Insira a nota do primeiro teste");
        double c = teclado.nextDouble();
        c = c * 0.15;
        System.out.println("Insira a nota do segundo teste");
        double d = teclado.nextDouble();
        d = d * 0.15;
        double media = (a+b+c+d);
        System.out.println("A média final deste aluno é " +media);

    }
}
