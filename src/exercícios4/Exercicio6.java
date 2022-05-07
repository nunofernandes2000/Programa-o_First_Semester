package exercícios4;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vezes, i = 0;
        double num, total = 0, media;
        System.out.println("Quantos numeros prentende utilizar para a a sua média?");
        vezes = teclado.nextInt();
        do{
            i+=1;
            System.out.println("Insira o numero");
            num = teclado.nextDouble();

            total +=  num;
            if(i==vezes){
               media =  total/vezes;
                System.out.println(media);
            }
        }while(i<vezes);


    }
}
