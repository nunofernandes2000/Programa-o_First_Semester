package Exercícios2;
//Olhar para a Linha 24
// float f
//double d
//long l
//Notação cientifica EX: 4.4E+19 ou seja 4.4 mais 18 0s pq já está lá 1 casa decimal fazendo 19-1;
//EX2: 5.555E+5 ou seja 5.555 mais 2 0s pq já está lá 3 casas decimais fazendo 5-3
//pesquisar tipo cientifico

import java.util.Scanner;

public class Exercicio13_com_bigbang_e_uma_explicação {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique uma data com ano mes e dia");
        long ano = teclado.nextLong();
        int mes = teclado.nextInt();
        int dia = teclado.nextInt();
        if ((dia <= 0) || (dia >31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                || (dia >30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                || (mes >= 13 || mes < 0)
                || dia >28 && (mes == 2)
                || (ano <= -1.38E+10)){


            System.out.println("Erro");
        }
        else{
            System.out.println("Válido");
        }
    }
}

