package Exercícios8;

public class teste_Cilindro {
    public static void main(String[] args) {

        //construir objeto com construtor por defeito
        Cilindro cilindro1 = new Cilindro();
        System.out.println( "cilindro1" + cilindro1.toString());
        cilindro1.set_altura(5.0f);
        System.out.println("Depois da alteração: ");
        System.out.println( "cilindro1" + cilindro1.toString());

        //construir objeto com construtor com parametros
        Cilindro cilindro2 = new Cilindro(2.5f, "verde", 68);
        System.out.println("\ncilindro2"+ cilindro2);


    }
}
