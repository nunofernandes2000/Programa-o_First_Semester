package Exercícios2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intruduza um mês e um dia e diremos a estação do ano");
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        if ( mes == 12 && dia >=21 && dia <= 31){
            System.out.println("É inverno");
        }
        else if((mes == 1 || mes == 2) || (mes == 3 && dia <=21)){
            if(mes == 1 && dia <= 31 && dia >= 1){
                System.out.println("É inverno");

            }
            else if(mes == 2 && dia <= 28 && dia >= 1){
                System.out.println("É inverno");
            }
            else if(mes == 3 && dia <= 21 && dia >= 1){
                System.out.println("É inverno");
            }
            else{
                System.out.println("Introduza algo válido");
            }
        }
        else if((mes == 3 && dia >= 22) || (mes == 6 && dia <= 20) || mes == 4 || mes == 5){
            if(mes == 3 && dia >= 22 && dia <= 31){
                System.out.println("É primavera");
            }
            else if(mes == 6 && dia <=20 && dia >= 1){
                System.out.println("É primavera");

        }
            else if(mes == 4 && dia <= 30 && dia >=1){
                System.out.println("É primavera");
        }
            else if(mes == 5 && dia <= 31 && dia >=1){
            System.out.println("É primavera");
        }
            else{
            System.out.println("Introduza algo válido");
        }
            }
        else if((mes == 6 && dia >= 21) || (mes == 9 && dia <= 20) || mes == 7 || mes == 8){
            if(mes == 6 && dia >= 21 && dia <= 30){
                System.out.println("É verão");
            }
            else if(mes == 9 && dia <=20 && dia >= 1){
                System.out.println("É verão");

            }
            else if(mes >= 7 && mes <= 8 && dia <= 31 && dia >=1){
                System.out.println("É verão");
            }
            else{
                System.out.println("Introduza algo válido");
            }
        }
        else if((mes == 9 && dia >= 21) || (mes == 12 && dia <= 20) || mes == 10 || mes == 11){
            if(mes == 9 && dia >= 21 && dia <= 30){
                System.out.println("É outono");
            }
            else if(mes == 12 && dia <=20 && dia >= 1){
                System.out.println("É outono");

            }
            else if(mes == 10 && dia <= 31 && dia >=1){
                System.out.println("É outono");
            }
            else if(mes == 11 && dia <= 30 && dia >=1){
                System.out.println("É outono");
            }
            else{
                System.out.println("Introduza algo válido");
            }
        }
        else{
            System.out.println("Introduza algo válido");
        }
    }
}
