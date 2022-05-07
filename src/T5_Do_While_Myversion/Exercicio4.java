package T5_Do_While_Myversion;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int N;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas vezes toca o despertador?");
        N = teclado.nextInt();
        int i = 0;
        while(i <= N){
            System.out.println(i + " ACORDA CARALHOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
            i += 1;
        }
    }
}
