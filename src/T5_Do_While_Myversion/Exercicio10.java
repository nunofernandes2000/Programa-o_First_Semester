package T5_Do_While_Myversion;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        String option;
        int personagem;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("---- MENU ------");
            System.out.println(" PLAY");
            System.out.println(" SETTINGS");
            System.out.println(" CONTROLS");
            System.out.println(" EXIT");
            System.out.print("\nChoose your option:");
            option = teclado.next().toUpperCase();

            switch (option) {
                case "PLAY":
                    System.out.println("Playing.....");
                    System.out.println("Estás a jogar bem!");
                    break;
                case "SETTINGS":
                    System.out.println("Settings are...");
                    System.out.println("Que utilizador es?");
                    System.out.println("1 - heroi");
                    System.out.println("2 - vilão");
                    personagem = teclado.nextInt();
                    if (personagem == 1)
                        System.out.println("Es o herói");
                    else if (personagem == 2)
                        System.out.println("És o vilão");
                    else
                        System.out.println("Essa personagem não existe");

                    break;
                case "CONTROLS":
                    System.out.println("Controls are...");
                    break;
                case "EXIT":
                    System.out.println("Exiting. Bye...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            }while(!(option.equals("EXIT")));
            teclado.close();

    }
}