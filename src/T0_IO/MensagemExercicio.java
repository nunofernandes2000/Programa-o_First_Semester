package T0_IO;

import java.util.Scanner;

public class MensagemExercicio {
    public static void main(String[] args) {
        String username;
        String password;

        System.out.println("Insire o seu username e password");
        username = args[0];
        password = args[1];
        System.out.println("Bem Vindo, user" + " " +username+ " com a "+ "password " +password);
    }
}