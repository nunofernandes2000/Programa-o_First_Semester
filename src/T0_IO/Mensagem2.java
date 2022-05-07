package T0_IO;

import java.util.Scanner;

public class Mensagem2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica nome e apelido");
       String nome_completo = teclado.nextLine();
        System.out.println("Bem vindo, "+ nome_completo +"!");
        System.out.println("Qual é a tua idade");
        int idade = teclado.nextInt();
        System.out.println("Ah! para o ano terás "+ (idade+1)+"!" );

        teclado.close();
    }
}
//O .close elemina o objecto permitindo poupar memória.
//Usar o nextLine em vez do next permite adicionar mais que uma palavra
//O next Int é para numeros inteiros.
//Estuda durante o Fim de semana e talvez na sexta
//Lembra te todos os meus colegas iram querer entrar numa licenciatura portanto por um lado eles iram me ajudar por outro irei competir com todos eles por uma vaga numa futura licenciatura e talvez um mestrado