package Exercícios2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique a data com ano mes e dia em que nasceu");
        int ano = teclado.nextInt();
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        System.out.println("Que dia é hoje?");
        int atualano = teclado.nextInt();
        int atualmes = teclado.nextInt();
        int atualdia = teclado.nextInt();

        if ((dia <= 0) || (dia >31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                || (dia >30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                || (mes >= 13) || (mes < 0)
                || (dia >28) && (mes == 2)
                || (ano>atualano)
                || (ano==atualano) && (dia > atualdia) && (mes == atualmes)
                || (ano==atualano) && (mes > atualmes)){
             System.out.println("Erro");
         }
       else if ((dia <=atualdia && mes == atualmes) || (mes < atualmes)){
            System.out.println(atualano-ano);
        }
        else if((mes > atualmes) || (dia > atualdia && mes == atualmes)){
            System.out.println((atualano-1)-ano);
        }
        else{
            System.out.println("Erro2");

        }
    }
}
