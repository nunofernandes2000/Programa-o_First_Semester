package Exercícios7;

import java.util.Scanner;

public class Exercicio3b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a altura do triangulo?");
        double altura = teclado.nextDouble();
        System.out.println("Qual a altura da base?");
        double base = teclado.nextDouble();
        System.out.println(area(altura,base));
    }
    public static double area(double base, double altura){
        double area = (base*altura)/2;
        return area;
    }
}
