package Exercícios6;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas[] = new int[7];
        double media = 0;
        int total = 0;
        for(int i = 0;i< horas.length;i++){
            System.out.println("Insira as horas que proramou no dia "+(i+1));
            horas[i]= teclado.nextInt();
            media+=horas[i];
            total+=horas[i];
        }
        media /= horas.length;
        System.out.println(media+" Esta foi a sua média diária de horas por dia\n");
        System.out.println(total+" Este foi o numero de horas totais que passou a programar\n");
        for(int i = 0;i< horas.length;i++){
            System.out.println(horas[i]+" Estas foram o numero de horas que passou a programar no dia "+(i+1));
        }
    }
}
