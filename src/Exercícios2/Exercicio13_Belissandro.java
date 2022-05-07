package Exercícios2;
import java.util.Scanner;
public class Exercicio13_Belissandro {
        public static void main(String[] args) {
            int d,m,a;

            Scanner input = new Scanner(System.in);

            System.out.println("Introduza uma data (dia, mês e ano)");
            d = input.nextInt();
            m = input.nextInt();
            a = input.nextInt();


            if ((m == 2 && d>=1 && d<=28 && a>0)||(m == 2 && d>=1 && d<=29 &&(a%4==0 && a%100!=0||a % 400 == 0))){
                System.out.println("Data válida");
            }
            else if ((m == 4 || m == 6 || m == 9 || m == 11) && d>=1 && d<=30 && a>0){
                System.out.println("Data válida");
            }
            else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d>=1 && d<=31 && a>0){
                System.out.println("Data válida");
            }
            else{
                System.out.println("Data inválida");
            }

            input.close();
        }

    }
    
