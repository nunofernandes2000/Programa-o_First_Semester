package Exercícios;

public class Exercicio16 {
    public static void main(String[] args) {
        System.out.println("Lança 2 dados e soma");
        int a = (int)(Math.random()*6)+1;

        int b = (int)(Math.random()*6);
        b = b +1;


        int c = a + b;
        System.out.println("O dado numero 1 deu     "+a+ "     o dado numero 2 deu     " +b+"     sendo a soma desses 2 dados     "+c);
    }
}
// int (Math.random()*(Valor Maximo)+valor minimo)