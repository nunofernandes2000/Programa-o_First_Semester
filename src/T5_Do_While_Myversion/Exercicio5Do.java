package T5_Do_While_Myversion;

import java.util.Scanner;

public class Exercicio5Do {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char i = 121; //y == 121 na tabela ascii
        do{
            System.out.println("ACORDA? NÃO ESTAS ACORDADO Y/N?");
            i = teclado.next().toLowerCase().charAt(0);
        }
        while(i == 121);
            System.out.println("Bom Dia");
        }

    }
