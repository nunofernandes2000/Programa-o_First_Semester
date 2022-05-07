package exercícios4;

import java.util.Scanner;

public class Exercicio9Do {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int dia, mes, ano;
    int x;
    int continuar = 1;
    do{
        System.out.println("Qual é o dia, mes e ano?");
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        int ano0 = ano - (14 - mes) / 12;
        x = ano0 + ano0 / 4 - ano0 / 100 + ano0 / 400;
        int mes0 = mes + 12 * ((14 - mes) / 12) - 2;
        int dia0 = (dia + x + 31 * mes0 / 12) % 7;

        //nao percebi o uso das formulas, o que é o x?

        if ((dia <= 0) || (dia > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                || (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                || (mes >= 13 || mes < 0)
                || dia >= 29 && (mes == 2) && !(((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)))
                || dia > 29 && (mes == 2) && (((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)))) {
            System.out.println("Data não é válida");
            System.out.println("Pretendes repetir? 0 = NÃO 1 = SIM");
            continuar = teclado.nextInt();
        } else {
            continuar = 0;
            switch (dia0) {
                case 0:
                    System.out.println("Domingo");
                    break;
                case 1:
                    System.out.println("Segunda");
                    break;
                case 2:
                    System.out.println("Terça");
                    break;
                case 3:
                    System.out.println("Quarta");
                    break;
                case 4:
                    System.out.println("Quinta");
                    break;
                case 5:
                    System.out.println("Sexta");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Erro no calculo");
            }
        }
    }while(continuar==1);
}
}
