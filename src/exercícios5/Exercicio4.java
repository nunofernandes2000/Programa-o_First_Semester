package exercícios5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, i, N, idademax = Integer.MIN_VALUE, idademin = Integer.MAX_VALUE, maioridade = 0;
        float media = 0;

        System.out.println("Número de pessoas: ");
        N = teclado.nextInt();
        for(i=1; i<=N; i++){
            System.out.println("Idade da pessoa "+ i+": ");
            idade = teclado.nextInt();
            media += idade;
            if(idade>idademax){
                idademax = idade;

            }
            else{

            }
            if(idade<idademin){
                idademin = idade;
            }
            else{

            }
            if(idade>=18)
                maioridade += 1;
        }

        media /= N;
        System.out.println("Média das idades: "+ media);
        System.out.println(idademax);
        System.out.println(idademin);
        System.out.println(maioridade);
        teclado.close();
    }
}
