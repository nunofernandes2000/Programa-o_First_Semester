package exercícios4;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int cont = 1, i = 0, nota, total = 0;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculador de médias");
        do{
            i += 1;
            System.out.println("Insira a "+(i)/*(+1)*/+"º "+"nota de 0 a 20");
            nota = teclado.nextInt();
            if(nota>=0 && nota<=20) {
                //i += 1;
                total += nota;
            }
            else{
                i -= 1;
                System.out.println("Numero Inválido insira um numero de 0 a 20 na proxima tentativa");
            }
            System.out.println("Prentende Continuar? 0 = NÃO 1 = SIM");
            cont = teclado.nextInt();
            if(cont!=1){
                media = total/i;
                System.out.println(media);

            if(media<=12 && media>= 0){
                System.out.println("A média equivale a um F");
            }
            else if(media<=14 && media>12){
                System.out.println("A média equivale a um D");
            }
            else if(media<=16 && media>14){
                System.out.println("A média equivale a um C");
            }
            else if(media<=18 && media>16){
                System.out.println("A média equivale a um B");
            }
            else if(media<=20 && media>18){
                System.out.println("A média equivale a um A");
            }
            else{
                System.out.println("Como é que isto veio para aqui?");
            }
            }
        }while(cont==1);
    }
}
