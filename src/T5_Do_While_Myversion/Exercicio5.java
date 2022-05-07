package T5_Do_While_Myversion;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char i = 121; //y == 121 na tabela ascii
        while(i == 121){
            System.out.println("ACORDA? NÃO ESTAS ACORDADO Y/N?");
            i = teclado.next().toLowerCase().charAt(0);
        }
        System.out.println("BOM DIA");
    }
}
