package T3_IO_IF_ELSE;

import java.util.Scanner;

public class Ex1_ifelse {
    public static void main(String[] args) {
        int horas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que horas são?");
        horas = teclado.nextInt();
        //boolean p = horas<10;
        //if (p)verdadeiro{ ou if (!p)falso
        //System.out.println("Ainda tens tempo para chegar á aula");
        //se ainda não forem 10 horas ainda tens tempo para chegar á aula
        if (horas<10){
            System.out.println("Ainda tens tempo para chegar á aula");
        }
        else{
            System.out.println("Estás atrasado para a aula");
        }
    }
}
