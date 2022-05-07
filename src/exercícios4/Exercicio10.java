package exercícios4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int a, resposta, continuar;
        Scanner teclado = new Scanner(System.in);
        continuar = 1;
        a = (int)(Math.random()*10)+1;
        do {
            //a = (int)(Math.random()*10)+1;
            System.out.println("Qual é o numero que foi gerado aleatoreamente? entre 1 e 10");
            resposta = teclado.nextInt();
            if(resposta <1 || resposta>10){
                System.out.println("Resposta inválida");
            }
            else if(resposta != a){
                System.out.println("ERRASTE!!!!!");
            }
            else{
                System.out.println("Parabens acertaste!!!");
                System.out.println("Pretendes continuar? 0 = Não 1 = Sim");
                //continuar = teclado.nextInt();

            }
        }while(resposta != a || continuar == 1);
    }
}
//dentro do comentário está a solução para o numero estar sempre a mudar