package Exercícios3;

import java.util.Scanner;

public class ExercicioE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2,  num3;
        System.out.println("Insira um numero entre 0 e 99");
        num1 = teclado.nextInt();
        num2 = num1/10;
        num3 = num1%10;
        if (num1 > 99){
            System.out.println("Insira um numero menor que 99");
        }
        else if(num1 < 1){
            System.out.println("Insira um numero maior que 0");
        }
        else if(num1 >= 1 && num1 < 20){
        switch(num1){
            case 0:
                System.out.println("Zero");break;
                case 1:
                System.out.println("Um");break;
                case 2:
                System.out.println("Dois");break;
                case 3:
                System.out.println("Três");break;
                case 4:
                System.out.println("Quatro");break;
                case 5:
                System.out.println("Cinco");break;
                case 6:
                System.out.println("Seis");break;
                case 7:
                System.out.println("Sete");break;
            case 8:
                System.out.println("Oito");break;
            case 9:
                System.out.println("Nove");break;
            case 10:
                System.out.println("Dez");break;
            case 11:
                System.out.println("Onze");break;
            case 12:
                System.out.println("Doze");break;
            case 13:
                System.out.println("Treze");break;
            case 14:
                System.out.println("Quatorze");break;
            case 15:
                System.out.println("Quinze");break;
            case 16:
                System.out.println("Dezasseis");break;
            case 17:
                System.out.println("Dezassete");break;
            case 18:
                System.out.println("Dezoito");break;
            case 19:
                System.out.println("Dezanove");break;
            default:
                System.out.println("erro");break;



        }
        }
        else if(num1 == 20 || num1 == 30 || num1 == 40 || num1 == 50 || num1 == 60 || num1 == 70 || num1 == 80 || num1 == 90){
            switch(num1){
                case 20:
                System.out.println("Vinte");break;
                case 30:
                    System.out.println("Trinta");break;
                case 40:
                    System.out.println("Quarenta");break;
                case 50:
                    System.out.println("Cinquenta");break;
                case 60:
                    System.out.println("Sessenta");break;
                case 70:
                    System.out.println("Setenta");break;
                case 80:
                    System.out.println("Oitenta");break;
                case 90:
                    System.out.println("Noventa");break;
                default:
                    System.out.println("erro 2");break;
            }
        }
        else{
            switch (num2){

                case 2:
                    System.out.print("Vinte");break;
                case 3:
                    System.out.print("Trinta");break;
                case 4:
                    System.out.print("Quarenta");break;
                case 5:
                    System.out.print("Cinquenta");break;
                case 6:
                    System.out.print("Sessenta");break;
                case 7:
                    System.out.print("Setenta");break;
                case 8:
                    System.out.print("Oitenta");break;
                case 9:
                    System.out.print("Noventa");break;
                default:
                    System.out.print("erro 3");break;


                    }
            switch(num3){
                case 1:
                    System.out.println(" e "+"um");break;
                case 2:
                    System.out.println(" e "+"dois");break;
                case 3:
                    System.out.println(" e "+"três");break;
                case 4:
                    System.out.println(" e "+"quatro");break;
                case 5:
                    System.out.println(" e "+"cinco");break;
                case 6:
                    System.out.println(" e "+"seis");break;
                case 7:
                    System.out.println(" e "+"sete");break;
                case 8:
                    System.out.println(" e "+"oito");break;
                case 9:
                    System.out.println(" e "+"nove");break;
                default:
                    System.out.println(" e "+"erro 4");break;
            }

        }

}
}