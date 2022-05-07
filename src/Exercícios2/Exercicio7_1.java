package Exercícios2;

import java.util.Scanner;

public class Exercicio7_1 {
    /*IMC Classificação
    <18,5 Magreza
    18,5 – 25
    (inclusive)
    Saudável
    25 -30 Sobrepeso
    >=30 Obesidade
    */
//IMC é igual a peso / (altura*altura)!!!
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            double imc;
            double peso;
            double altura;
            System.out.println("Indique o seu peso?");
            peso = teclado.nextDouble();
            System.out.println("Indique a sua altura?");
            altura  = teclado.nextDouble();
            imc =  peso/(altura*altura);
            System.out.println("IMC " +imc);

            if (imc<18.5){
                System.out.println("O calculo do seu imc indica que está na magreza");
            }
            else if (imc >= 18.5 && imc < 25){
                System.out.println("O calculo do seu imc indica que está saudavel");
            }
            else if (imc >= 25 && imc < 30){
                System.out.println("O calculo do seu imc indica que está sobrepeso");
            }
            else if (imc >=30){
                System.out.println("O calculo do seu imc indica que está na obesidade");
            }
            else
                System.out.println("Não existe");



        }
    }
