package exercícios4;

import java.util.Scanner;

public class Exercicio4Tentativasocomwhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option = 0, i = 0;
        char des = 'n';
        while(i != 0){
            if(option == 4){

            }
            else{
                System.out.println("Pretendes desistir? S/N");
                des = teclado.next().toUpperCase().charAt(0);
        }


            System.out.println("Qual o comando para terminar uma instrução switch em Java? Insere o numero correspondente");
            System.out.print("Default = 1");
            System.out.print("Case = 2");
            System.out.print("Else = 3");
            System.out.print("Break = 4");
            System.out.print("Switch = 5");
            System.out.println();
            option = teclado.nextInt();
            des = 'S';
            while (option != 4 || des == 'S'){
                i += 1;
            if (option >= 1 && option <= 5) {
                switch (option) {
                    case 4:
                        System.out.println("Parabens acertaste" + " á " + i + "ª tentativa");
                        break;
                    default:
                        System.out.println("Erraste"+ " e esta é a tua "+i+"º tentativa");
                        break;
                }
            } else {
                System.out.println("insira uma resposta válida"+" e esta é a tua "+i+"º tentativa");

            }

        }
    }
    }

}
