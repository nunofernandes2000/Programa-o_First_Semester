package T4_Switch_Case;

import java.util.Scanner;

/*
Programa que pede nota entre 1 e 5 e escreve  valor qualitativo
1 - 2 - Insuficiente
3 - Suficiente
4 - Bom
5 - Muito Bom
Usa If Else
 */
public class exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        System.out.println("Indica uma nota entre 1 e 5: ");
        nota = teclado.nextInt();

        if(nota ==1 || nota ==2)
            System.out.println("Insuficiente");
        else if (nota == 3)
            System.out.println("Suficiente");
        else if (nota == 4)
            System.out.println("Bom");
        else if(nota ==5)
            System.out.println("Muito Bom");
        else
            System.out.println("Valor inválido");

        teclado.close();


    }

}
