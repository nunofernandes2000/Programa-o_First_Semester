package Exercícios2;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Indique uma data com ano mes e dia");
                int ano = teclado.nextInt();
                int mes = teclado.nextInt();
                int dia = teclado.nextInt();


                if ((dia <= 0) || (dia >31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                        || (dia >30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                        || (mes >= 13 || mes < 0)
                        || dia >=29 && (mes == 2) && !(((ano%4==0) && (ano%100!=0) || (ano%400==0)))
                        || dia >29 && (mes == 2) && (((ano%4==0) && (ano%100!=0) || (ano%400==0)))){
                    System.out.println("Não válido");
                }


                else{
                    System.out.println("Válido");
                }
            }
        }
