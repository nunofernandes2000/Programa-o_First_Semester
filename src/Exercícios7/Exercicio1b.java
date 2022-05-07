package Exercícios7;

import java.util.Scanner;

public class Exercicio1b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.println("Intruduza um numero de um mês");
        mes = teclado.nextInt();
        System.out.println(mes_do_ano(mes));

    }
    public static String mes_do_ano(int n_mes){

        String meses[]={" ","Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};





        return meses[n_mes];
    }


}
