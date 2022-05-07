package T0_IO;

import java.util.Scanner;

public class Mensagem3 {
    public static void main(String[] args) {
        String nome;
        String apelido;
        String idade;
        System.out.println("Insire o seu nome, apelidoe idade");
        nome = args[0];
        apelido = args[1];
        idade = args[2];
        System.out.println("Bem Vindo," + " " +nome +" "+ apelido+ "de "+idade+ " " +"anos" +"!");
    }
}
