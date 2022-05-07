package exercícios5;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este Programa calcula o salário previsto numa impresa de IT ao fim de 5 anos");
        int ano, anofinal = 5;
        double sal = 1400;
        for (ano = 0; anofinal >= ano; ) {
            ano++;
            if (ano == 1) {
                System.out.println("O salário antes do " + ano + "º" + " é de " + sal + "€");
                sal = sal + (sal * 0.015);
                System.out.println("O salário no " + ano + "º" + " é de " + sal + "€");
            } else if (ano > 1) {
                sal = sal + (sal * 0.018);
                System.out.println("O salário no " + ano + "º" + " é de " + sal + "€");
            }
        }

    }
}
