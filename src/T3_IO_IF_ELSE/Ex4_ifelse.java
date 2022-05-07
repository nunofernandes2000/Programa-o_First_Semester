package T3_IO_IF_ELSE;
//Pede clubes de futebol ao utilizador e indica as cores respetivas.

import java.util.Scanner;
//Só conhecemos
//SLB - Vermelho e Branco
//SCP - Verde e Branco
//Cambridge(CU) - laranja e preto
//Palmeiras - Verde
public class Ex4_ifelse {
    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o seu clube favorito SLB/SCP/CAMBRIDGE/PALMEIRAS");
        nome = teclado.next();
        //nome.toUpperCase(); Converte a string para letra maiscula;
        //nome.toLowerCase(); Converte a string para letra minuscula;
        //Ex:
        // if(nome.toUppercase()nome.equals("CAMBRIDGE")){
        if(nome.equals("CAMBRIDGE")){
            System.out.println("As cores do teu clube são laranja e preto");
        }
        else if(nome.equals("SCP")){
            System.out.println("As cores do teu clube são verde e branco");

        }
        else if(nome.equals("PALMEIRAS")){
            System.out.println("A cor do teu clube é verde");
        }
        else if(nome.equals("SLB")){
            System.out.println("As cores do teu clube são vermelho e branco");
        }
        else{
            System.out.println("Insira um clube válido na proxima vez");
        }
    }
}
