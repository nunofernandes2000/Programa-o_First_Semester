package T6_Arrays_Myversion;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        int N;
        int[] notas;
        float media = 0;
        int acimamedia = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos alunos?" );
        N = teclado.nextInt();

        notas = new int[N];
        for (int i=0; i<N;i++){
            System.out.println("Nota["+i+"]: ");
            notas[i]= teclado.nextInt();
            media +=notas[i];

        }
        double media2 = media /N;
        System.out.println("\nMedia das Notas: "+media2);
        for (int i=0; i<N;i++){
            if(notas[i]>media2)
            acimamedia++;
        }
        System.out.println("Notas acima média: "+acimamedia);
        double percent = (acimamedia*100)/N;
        System.out.println("Percentahem de notas acima da média: "+percent);
        teclado.close();
    }
}
