package T1_VAR;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa pede 2 valores sendo o primeiro decimal e o segundo inteiro ao utilizador");
        System.out.println("insere 2 numeros");
        double a = teclado.nextDouble();
        int b = teclado.nextInt();

        System.out.println(a+ " Elevado a "+ b+" é igual a "+ (long)Math.pow(a, b));
        System.out.println(a+ " Elevado a "+ b+" é têem o numero inteiro de "+ (int)Math.pow(a, b));
        System.out.println("Entre " +a+" e " +b +" o valor máximo é " +Math.max(a, b));
        System.out.println("Entre " +a+" e " +b +" o valor minimo é " +Math.min(a, b));
        System.out.println("A raiz de "+ a+ " "+Math.sqrt(a) +" e a de "+b+ " é "+ (Math.sqrt(b)));
        System.out.println(a+ " Elevado a "+ b+" é igual a "+ Math.pow(a, b));
    }
}
