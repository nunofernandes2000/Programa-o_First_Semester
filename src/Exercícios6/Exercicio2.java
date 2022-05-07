package Exercícios6;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] =  new int[50];
        int a = 1;
        int i;
        for(i = 0;a!=999 && i<num.length;i++){
            System.out.println("Insira um numero");
            a = teclado.nextInt();
            if(a!=999){
                num[i] = a;
            }
            else{
                i--;
            }
        }
        for(int e = 0;e<i;e++){
            System.out.println(num[e]);
        }
    }
}
