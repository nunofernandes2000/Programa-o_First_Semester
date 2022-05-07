package Exercícios6;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mes[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        System.out.println("Insere o numero do mês de 1 a 12");
        int mesn = teclado.nextInt()-1;
        System.out.println(mes[mesn]);
    }
}
