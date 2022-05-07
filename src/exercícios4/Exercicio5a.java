package exercícios4;

import java.util.Scanner;

public class Exercicio5a {
    public static void main(String[] args) {
        int i = 33;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Imprime os caracteres da tabela ASCII a partir do 33 até ao 126");
        while(i >= 33 && i <= 126){
                System.out.println((char)i);
                i+=1;
        }
    }
}
