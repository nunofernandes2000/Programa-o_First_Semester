package Exercícios7;

import java.util.Scanner;

public class Exercicio1a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.println("Intruduza um numero de um mês");
        mes = teclado.nextInt();
        mes_do_ano(mes);
    }
    public static void mes_do_ano(int n_mes){
        String meses[]={" ","Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        System.out.println();
        if(n_mes>0 && n_mes<=12){
            System.out.println(meses[n_mes]);
        }
        else{
            System.out.println("Mês Invalido");
        }
    }
}
