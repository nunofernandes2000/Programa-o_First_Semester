package T4_Switch_Case;


import java.util.Scanner;

/*
Programa que pede nota entre 1 e 5 e escreve  valor qualitativo
1 - 2 - Insuficiente
3 - Suficiente
4 - Bom
5 - Muito Bom
Usa Switch Case
 */
public class exe2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        System.out.println("Indica uma nota entre 1 e 5: ");
        nota = teclado.nextInt();

        switch (nota){
            case 1:
            case 2:
                System.out.println("Insuficiente");break;
            case 3:
                System.out.println("Suficiente");break;
            case 4:
                System.out.println("Bom");break;
            case 5:
                System.out.println("Muito Bom");break;
            default:
                System.out.println("Valor Inválido");

        }


    }
}
