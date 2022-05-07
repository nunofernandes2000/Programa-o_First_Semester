/*package exercícios4;

import java.util.Scanner;

public class Teste9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean invalida = true;
        int x;
        do{
            System.out.println("Indique uma data(dia mes ano");
            int dia = teclado.nextInt();
            int mes = teclado.nextInt();
            int ano = teclado.nextInt();
            int ano0 = ano - (14 - mes) / 12;
            x = ano0 + ano0 / 4 - ano0 / 100 + ano0 / 400;
            int mes0 = mes + 12 * ((14 - mes) / 12) - 2;
            int dia0 = (dia + x + 31 * mes0 / 12) % 7;
            if(mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31){
                if (mes == 2 && dia <=29) {
                    System.out.println("Data válida");
                    invalida = false;
                }
                else if((mes == 4 || mes == 6  || mes == 9 || mes == 11) && dia <=30){
                    System.out.println("Data válida");
                invalida = false;
                else if((mes == 1 || mes == 3 || mes == 5 || mes == 7|| mes == 8|| mes == 10 || mes == 11 )&& dia <= 31)
                    System.out.println("Data válida");
                invalida = false;
                else{
                        invalida = true;
                    }
                else
            }
        }while(invalida == false);
            switch (dia0) {
                case 0:
                    System.out.println("Domingo");
                    break;
                case 1:
                    System.out.println("Segunda");
                    break;
                case 2:
                    System.out.println("Terça");
                    break;
                case 3:
                    System.out.println("Quarta");
                    break;
                case 4:
                    System.out.println("Quinta");
                    break;
                case 5:
                    System.out.println("Sexta");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Erro no calculo");
    }
}
*/