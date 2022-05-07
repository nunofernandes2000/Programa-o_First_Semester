package exercícios5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int n = 0, total = 0;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos numeros pretende inserir?");
        int vezes = teclado.nextInt();
        for (int i=1; i<=vezes; i++){
            System.out.println("Insira o numero: "+i+" ");
             n = teclado.nextInt();
            total += n;
        }
        float media = total / vezes;
        System.out.println(media);
}
}
/* ####Solução alternativa
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, i, N;
        float media = 0;
        System.out.println("Quantos numeros pretende inserir?");
        N = teclado.nextInt();
        for(i=1; i<=N; i++){
            System.out.println("Insira o numero: "+ i+": ");
            numero = teclado.nextInt();
            media += numero;
        }
        media /= N;
        System.out.println("Média dos numeros: "+ media);
        teclado.close();
    }
 */