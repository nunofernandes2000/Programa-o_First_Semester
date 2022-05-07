package Exercícios2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, media;
        System.out.println("Este programa calcula a média da nota final d eum aluna e diz se ele reprovou o passou");
        System.out.println("Insira a primeira nota");
        a = teclado.nextDouble();
        System.out.println("Insira a segunda nota");
        b = teclado.nextDouble();
        System.out.println("Insira a terceira nota");
        c = teclado.nextDouble();
        media = (a*0.2)+(b*0.5)+(c*0.3);
        if(a<=20 && a>0 && b<=20 && b>0 && c<=20 && c>0 && media<9.5){
            System.out.println("O aluno reprovou com média de "+media);
        }
        else if(a<=20 && a>0 && b<=20 && b>0 && c<=20 && c>0 && media>=9.5){
            System.out.println("O aluno passou com média de "+media);
        }
        else{
            System.out.println("o que introduziu não é valido por favor introduza denovo");
        }
    }
    }

