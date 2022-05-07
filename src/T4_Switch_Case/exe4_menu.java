package T4_Switch_Case;


import java.util.Scanner;

public class exe4_menu {
    public static void main(String[] args) {
        int option;
        Scanner teclado = new Scanner(System.in);
        System.out.println("---- MENU ------");
        System.out.println(" 1 - PLAY");
        System.out.println(" 2 - SETTINGS");
        System.out.println(" 3 - CONTROLS");
        System.out.println(" 4 - EXIT");
        System.out.print("\nChoose your option:");
        option = teclado.nextInt();

        switch (option){
            case 1 :
                System.out.println("Playing.....");break;
            case 2:
                System.out.println("Settings are...");break;
            case 3:
                System.out.println("Controls are...");break;
            case 4:
                System.out.println("Exiting. Bye...");break;
            default:
                System.out.println("Invalid option.");break;
        }

        teclado.close();


    }
}
