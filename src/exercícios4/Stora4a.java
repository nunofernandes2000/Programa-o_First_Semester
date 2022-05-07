package exercícios4;
import java.util.Scanner;

public class Stora4a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char  op; //para guardar resposta
        char  continua='S'; //para saber se é para continuar

        System.out.println("Qual é o comando que termina uma instrução switch em JAVA?");
        System.out.println("A:\tcase\nB:\tdefault\nC:\tbreak\nD:\telse\nE:\tNenhuma das Restantes");

        while(continua=='S'){
            System.out.print("\nSua resposta: ");
            op =  teclado.next().toUpperCase().charAt(0);
            if(op=='C') {
                System.out.println("Correto, parabéns!");
                continua = 'N'; //para terminar o ciclo
            }
            else {
                System.out.print("Errado.Deseja tentar de novo? (S/N) ");
                continua = teclado.next().toUpperCase().charAt(0);
            }
        }
        teclado.close();
    }
}
