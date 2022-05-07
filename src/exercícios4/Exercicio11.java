package exercícios4;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String string;
        int i =0;
        System.out.println("Conta palavras");
        System.out.println("Insira um texto");
        string = "a";
        while(!(string.equals("stop"))){
            string = teclado.next();
            i++;

        }
        System.out.println("Numero de palavras: "+(i-1));
    }
}
