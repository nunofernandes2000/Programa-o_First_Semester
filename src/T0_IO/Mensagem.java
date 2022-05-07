package T0_IO;

import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá qual o teu nome?");
        String nome = teclado.next();
        System.out.println("E agora introduz o teu apelido?");
        String apelido = teclado.next();
        System.out.println("Bem vindo, " + nome+ " " +apelido+ "!");
    }
}
//Scanner é uma Biblioteca
/* Este Programa irá pedir o nome de utilizador e depois irá dar uma mensagem de boas vindas a essa utilizador*/
// String é uma variável, EDIT: aparentemente existen vários tipos de variaveis(equivalente ao var e ao let do javascript????)
// Não é preciso espaço entre o variável e o sinal de mais.
