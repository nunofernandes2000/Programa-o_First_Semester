package T5_Do_While_Myversion;
//IGUAL AO T6_Exemplo4
import java.util.Scanner;

public class Exercicio9Retangulo {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Insira a Altura e o Lado ");
            int A = teclado.nextInt();
            int L = teclado.nextInt();
            int i = 0;
            int j = 0;
            while(i<A){
                j = 0;
                while(j<L){
                    System.out.print("# ");
                    j+=1;
                }
                System.out.println("");
                i+=1;
            }
        }
    }


