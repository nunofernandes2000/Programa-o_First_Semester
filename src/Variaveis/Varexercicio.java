package Variaveis;

import java.util.Scanner;

public class Varexercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        boolean b;
        float f;
        double d;
        char c;
        System.out.println("Intruduz um numero inteiro");
  i = teclado.nextInt();
        System.out.println("Intruduz True or False");
  b = teclado.nextBoolean();
        System.out.println("Intruduz um numero decimal grande");
  f = teclado.nextFloat();
        System.out.println("Intruduz um numero decimal");
  d = teclado.nextDouble();
        System.out.println("Intruduz uma letra");
  c = teclado.next().charAt(0);


        System.out.println("O valor inteiro é " +i+ " por sua vez o boolean é " +b+ " sendo o char " +c+ " entretanto o double é "+d+ " e o float é " +f);
        teclado.close();
    }
}
