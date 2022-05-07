package Exercícios7;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio4a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor da Variavel 1/X");
        double var1 = teclado.nextDouble();
        System.out.println("Valor da Variavel 2/Y");
        double var2 = teclado.nextDouble();
        calculadistancia(var1,var2);
        System.out.println(calculadistancia(var1,var2)+" é a distancia no plano entre as duas variaveis");
    }
    public static double calculadistancia(double var1,double var2){

      double distancia =  Math.sqrt(Math.pow(var1,2)+Math.pow(var2,2));



        return distancia;
    }

}
