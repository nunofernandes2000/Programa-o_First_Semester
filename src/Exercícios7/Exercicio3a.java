package Exercícios7;

import java.util.Scanner;

public class Exercicio3a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a altura do triangulo?");
        double altura = teclado.nextDouble();
        System.out.println("Qual a altura da base?");
        double base = teclado.nextDouble();
        area(altura,base);
    }
    public static void area(double base, double altura){
        double area = (base*altura)/2;
        System.out.println(area);

    }
}
