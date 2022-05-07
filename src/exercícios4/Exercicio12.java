package exercícios4;

import java.util.Scanner;

public class Exercicio12 {
        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            String string;
            int i =0;
            System.out.println("Conta palavras");
            System.out.println("Insira um texto");
            int string23 = 0;
            string = "a";
            while(!(string.equals("stop"))){
                string = teclado.next();
                string23 = string.length(); //string.replace(" ", "").length();
               i +=  string23;

            }
            System.out.println("Numero de palavras: "+(i-4));
        }
    }

