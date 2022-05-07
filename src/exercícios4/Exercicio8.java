package exercícios4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        char conta;
        do{
            System.out.println("Qual a operação? / + - *");
            conta = teclado.next().charAt(0);
            if(conta == '*' || conta == '/' || conta == '+' || conta == '-') {
                System.out.println("Insira os 2 numeros");
                double a = teclado.nextDouble();
                double c = teclado.nextDouble();
                if (conta == '*') {
                    System.out.println(a * c);
                } else if (conta == '/') {
                    System.out.println(a / c);
                } else if (conta == '-') {
                    System.out.println(a - c);
                } else if (conta == '+') {
                    System.out.println(a + c);
                }
            }
            else{
                System.out.println("Operação inválida tente de novo");
            }
            System.out.println("Pretende continuar? 0 = NÃO 1 = SIM");
            cont = teclado.nextInt();
        }while(cont==1);
    }
}
