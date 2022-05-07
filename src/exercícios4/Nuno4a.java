package exercícios4;
import java.util.Scanner;
public class Nuno4a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String option;
        String num;
        num = "SIM";

        while (num.equals("SIM")) {
            System.out.println("Qual é o comando para terminar uma instrução switch em Java?");
            System.out.println("Opção: break");
            System.out.println("Opção: end");
            System.out.println("Opção: if");
            System.out.println("Opção: else");
            System.out.println("Opção: delete");
            option = teclado.next().toUpperCase();

            switch (option) {
                case "BREAK":
                    System.out.println("Parabéns acertaste");
                    num = "Não";
                    break;
                default:
                    System.out.println("Erraste, tenta de novo!");
                    System.out.println("Queres continuar?");
                    num = teclado.next().toUpperCase();
                    break;
            }


        }
    }
}
