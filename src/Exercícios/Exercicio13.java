package Exercícios;

import java.util.Scanner;

//Elabore um programa que calcula a distância euclidiana entre o ponto (0,0) e o ponto
//cujas coordenadas são inseridas pelo utilizador.
public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("Este Programa calcula a distancia euclidiana");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduza o X1 e o Y1");
        Double X1 = teclado.nextDouble();
        Double Y1 = teclado.nextDouble();
        System.out.println("Introduza o X2 e o Y2");
        Double X2 = teclado.nextDouble();
        Double Y2 = teclado.nextDouble();
        Double DX = X2-X1;
        Double DY = Y2-Y1;
        Double DT = Math.sqrt(Math.pow(DX, 2) + Math.pow(DY, 2));


        System.out.println("A distancia é de " + DT);

        teclado.close();

    }
}
