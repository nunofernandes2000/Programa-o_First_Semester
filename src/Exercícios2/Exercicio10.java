package Exercícios2;

import java.util.Scanner;

//27-42 && 58-64 && 91-96 && 123-126caracteres especiais
//48-57 numeros
//65-90 grandes
//97-122
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner cansado = new Scanner(System.in);
        System.out.println("Introduza um caracter");
        char a = cansado.next().charAt(0);
        int b = a;//a
        System.out.println(b);
        System.out.println((int)a);
        if((a >= 32 && a <= 42) || (a >= 58 && a <= 64) || (a >= 91 && a <= 96) || (a >= 123 && a <=126)){
            System.out.println("Caracter");
        }
         else if (a >= 48 && a<=57 ){
            System.out.println("Numeros");

        }
        else if (a>=65 && a<=90){
            System.out.println("LETRAS GRANDES");

        }
        else if (a >= 97 && a<=122 ){
            System.out.println("letras pequenas");

        }

        else{
            System.out.println("Intruduza um caracter válido -_-");
        }
    }
}
