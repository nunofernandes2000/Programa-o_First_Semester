package Exercícios7;

import java.util.Scanner;

public class Exercicio2b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intruduza por ordem o dia mes e ano");
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();
           if(datas(dia,mes,ano)==true){
            System.out.println("Válido");
        }
            else{
            System.out.println("Inválido");
        }


    }

    public static boolean datas(int dia, int mes, int ano) {
        boolean bool = true;
        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
            if (!((dia <= 0) || (dia > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                    || (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                    || (mes >= 13 || mes < 0)
                    || dia > 28 && (mes == 2))) {
                bool = true;
            } else {
                bool = false;
            }
        } else if (!((dia <= 0) || (dia > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                || (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                || (mes >= 13 || mes < 0)
                || dia > 28 && (mes == 2))) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}
