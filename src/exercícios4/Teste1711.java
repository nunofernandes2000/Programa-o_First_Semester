package exercícios4;

import java.util.Scanner;

public class Teste1711 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            double IT;
            double IC;
            System.out.println("Introduza o Indíce de transmissibilidade");
            IT = teclado.nextDouble();
            System.out.println("Intruduza o Indice Cumulativa");
            IC = teclado.nextDouble();
            if ((IT < 0 || IC < 0)||(IC > 240)){
            System.out.println("Inválido");
        }
                else if ((IT <= 1 && IT > 0.5) && (IC < 120)) {
            System.out.println("Risco Verde");
        }
                else if ((IT <= 1 && IT > 0.5) && (IC < 240 && IC >= 120)){
            System.out.println("Risco Laranja");
        }
                else if ((IT > 1 && IT <= 1.5) &&(IC < 120)) {
                System.out.println("Risco Laranja");
            }
                else{
                System.out.println("Risco Vermelho");
            }
        }

        }

