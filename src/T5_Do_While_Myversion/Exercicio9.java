package T5_Do_While_Myversion;
//IGUAL AO T6_Exemplo4
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Lado do quadrado: ");
        int N = teclado.nextInt();
        int i = 0;
        int j = 0;
        while(i<N){
            j = 0;
            while(j<N){
                System.out.print("# ");
                j+=1;
            }
            System.out.println("");
            i+=1;
        }
    }
}
