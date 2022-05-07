package exercícios4;

import java.util.Scanner;

public class Exercicio4a {
    public static void main(String[] args) {
        int op, i = 0;
        char continua;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o comando para terminar uma instrução switch em Java? Insere o numero correspondente");
        System.out.println("Default = 1 ");
        System.out.println("Case = 2 ");
        System.out.println("Else = 3 ");
        System.out.println("Break = 4 ");
        System.out.println("Switch = 5 ");
        continua = 'S';
        while(continua=='S'){
            i += 1;
            System.out.println("\nSua Resposta: ");
            op = teclado.nextInt();
            if(op==4){
                System.out.println("Correcto, Parabéns!!!!"+" acertaste á "+i+"ª tentativa!");
                continua = 'N';
            }
            else{
                System.out.println("Errado "+"\n desejas continuar de novo? S/N");
                continua = teclado.next().toUpperCase().charAt(0);
            }
        }
        teclado.close();
    }
}