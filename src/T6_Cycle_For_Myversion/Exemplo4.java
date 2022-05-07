package T6_Cycle_For_Myversion;
//igual ao T5_Exemplo9 & ao T5_Exemplo9Retangulo
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        int A, L;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica a Altura e a Largura deste retangulo");
        L = teclado.nextInt();
        A = teclado.nextInt();

        for(int i=0; i<A; i++){

            for(int j=0; j<L; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
