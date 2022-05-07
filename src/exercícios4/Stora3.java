package exercícios4;
/*
3.	Programa que pede ao utilizador a resposta a uma pergunta e só termina o programa quando o
utilizador acertar na opção correta. A pergunta é: “Qual é o comando para terminar uma instrução switch
em Java?” . Deve haver 5 opções de resposta, incluindo a correta. O programa
emite uma mensagem de parabéns se o utilizador acertar e uma mensagem de erro se o utilizador errar.
 */

import java.util.Scanner;

public class Stora3 {

    public static void main(String[] args) {

        char op= ' ' ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o comando para terminar uma instrução switch em Java? ");

        System.out.print("a) break");
        System.out.print("\tb) continue");
        System.out.print("\tc)  enter");
        System.out.print("\td) default");
        System.out.println("\te) Nenhuma das restantes");
        while(op!='a') {
            System.out.print("\nEscolha a opção correta => ");
            op = teclado.next().charAt(0);
            if(op=='a')
                System.out.println("Correto. Parabéns!!");
            else
                System.out.println("Incorreto. Tenta de novo...");
        }
        teclado.close();
    }
}
