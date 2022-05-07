package T1_VAR;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa classifica o estado da tua vida");
        System.out.println("Sentes-te amado? (responder com true ou false)");
        boolean a = teclado.nextBoolean();
        System.out.println("Sentes te satisfeito com a tua vida financeira? (responder com true ou false)");
        boolean b = teclado.nextBoolean();
       boolean c = a && b;
        System.out.println("Se aparecer true a tua vida é boa caso contrário se aparecer um false a tua vida é má:     " +c);
 teclado.close();
    }
}
