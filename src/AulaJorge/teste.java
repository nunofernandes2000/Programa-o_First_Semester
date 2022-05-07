package AulaJorge;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char continuar='S';
        int i = 0;
        int teste;
        int positivos = 0;
        while(continuar=='S'){
            i+=1;
            System.out.println("TESTE"+" "+i);
            System.out.println("Indique 1 para positivo, 0 para negativo: ");
            teste = teclado.nextInt();
            if(teste==1) {
                positivos++;
            }
            System.out.println("Quer continuar escreva 'S' para continuar?");
            continuar = teclado.next().toUpperCase().charAt(0);
        }
        System.out.println(positivos);
        double positivos2 = positivos;
        double i2 = i;
        double percentagem = (positivos2/i2)*100;
        System.out.println("A percentagem de testes positivos: "+percentagem+"%");
        teclado.close();
    }

}
