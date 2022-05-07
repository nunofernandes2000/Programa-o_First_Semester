package T6_Cycle_For_Myversion;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, i, N;
        float media = 0;
        System.out.println("Número de pessoas: ");
        N = teclado.nextInt();
        for(i=1; i<=N; i++){
            System.out.println("Idade da pessoa "+ i+": ");
            idade = teclado.nextInt();
            media += idade;
        }
        media /= N;
        System.out.println("Média das idades: "+ media);
        teclado.close();
    }
}
