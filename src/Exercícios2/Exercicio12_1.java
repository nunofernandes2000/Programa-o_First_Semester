package Exercícios2;

import java.util.Scanner;
public class Exercicio12_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes;
        System.out.println("Indique o dia e o mês e veja a estação do ano correspondente");
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        if ((dia <= 0) || (dia >31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
         || (dia >30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
         || (mes >= 13 || mes < 0)
         || dia >28 && (mes == 2)){
            System.out.println("Erro");
        }
        else if (dia >= 21 && mes == 3 || mes == 4 || mes == 5 || dia < 21 && mes == 6) {
            System.out.println("Primavera");
        }
        else if (dia >= 21 && mes == 6 || mes == 7 || mes == 8 || dia < 21 && mes == 9) {
            System.out.println("Verão");
        }
        else if (dia >= 21 && mes == 9 || mes == 10 || mes == 11 || dia < 21 && mes == 12) {
            System.out.println("Outuno");
        }
        else if (dia >= 21 && mes == 12 || mes == 1 || mes == 2 || dia < 21 && mes == 3) {
            System.out.println("Inverno");
        }
        else {
            System.out.println("Erro");
        }
    }
}

