package T4_Switch_Case;


import java.util.Scanner;

/*
* Pede uma letra correspondente ao estado civil e escreve o respetivo estado:
* S - solteiro
* C - Casado
* V - Víuvo
* D - Divorciado
* */
public class exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char estadoCivil;

        System.out.println("Indica o estado civil (S,C,V,D) ");
        estadoCivil = teclado.next().charAt(0);

        switch (estadoCivil){
            case 's':
            case 'S':
                System.out.println("Solteiro");break;
            case 'c':
            case 'C':
                System.out.println("Casado");break;
            case 'v':
            case 'V':
                System.out.println("Víuvo");break;
            case 'd':
            case 'D':
                System.out.println("Divorciado");break;
            default:
                System.out.println("Não reconhecido");
        }
        teclado.close();

    }
}
