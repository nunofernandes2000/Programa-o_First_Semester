package T3_IO_IF_ELSE;
//Pede um numero e diz se é positivo negativo ou neutro
import java.util.Scanner;

public class Ex3_ifelse {
    public static void main(String[] args) {
        float num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica um número: ");
        num = teclado.nextFloat();
        if(num>0){
            System.out.println("POSTIVIO");

        }
        else if(num == 0) {
            System.out.println("NEUTRO");
        }
        else{
            System.out.println("NEGATIVO");
        }

    }
}
