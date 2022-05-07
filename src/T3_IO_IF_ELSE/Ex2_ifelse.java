package T3_IO_IF_ELSE;

import java.util.Scanner;

public class Ex2_ifelse {
    public static void main(String[] args) {


        int horas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que horas são");
        horas = teclado.nextInt();
        if(horas <10){
            System.out.println("Ainda tens tempo...");
        }
        else if(horas >10){
            System.out.println("Estás atrasado");
        }
        else if(horas  == 10){
            System.out.println("Corre está mesmo a começar corre");
        }
        else{

        }


    }
}
