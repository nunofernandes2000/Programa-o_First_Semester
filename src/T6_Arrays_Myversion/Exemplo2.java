package T6_Arrays_Myversion;

import java.util.Scanner;

//programa que usa dois arrays um com nome dos
// alunos e outro com as notas dos mesmos
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomes[] = {"Daniel", "Pedro", "Nuno", "Afonso", "Rafael", "Fausto", "João", "Belissandro"};
        int tam = nomes.length;//n+ de elementos no vector;
        System.out.println("Existem " + tam + " alunos na sala.");
        float notas[] = new float[tam];
        float media = 0;
        for (int i = 0; i < tam; i++) {
            System.out.println(i);
            System.out.println(nomes[i] + ",qual é a tua nota?");
            notas[i] = teclado.nextFloat();
            media += notas[i];
        }
        media /= tam;
        System.out.println("\nRESULTADOS: ");
        for (int i = 0; i < tam; i++) {
            System.out.println(nomes[i] + " - " + notas[i] + " valores.");
        }
        System.out.println("Média é de: " + media + "\n");
        System.out.println("Alunos com nota abaixo de 12 valores:");
        int alunos_abaixo12 = 0;
        for (int i = 0; i < tam; i++) {
            if (notas[i] < 12) {
                alunos_abaixo12++;
                System.out.println(nomes[i]);
            }
        }
        System.out.println(alunos_abaixo12 + " alunos com nota <12 valores");
        teclado.close();
    }
}