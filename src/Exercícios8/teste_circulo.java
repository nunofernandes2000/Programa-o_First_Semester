package Exercícios8;

public class teste_circulo {

    public static void main(String[] args) {

        //Construir um objeto da classe circulo
        Circulo C1 = new Circulo();
        System.out.println(C1.get_cor());
        C1.set_cor("AMARELO");
        System.out.println("Valor inical do raio: "+ C1.get_raio());
        C1.set_raio(4.5f);
        System.out.println("Agora raio é "+ C1.get_raio() +
                " e a cor é "+C1.get_cor());

        // objeto criado com ocntrutor de 2 parâmetros
        Circulo C2 = new Circulo(3.5f, "azul");
        System.out.println("Objeto C2: raio "+ C2.get_raio()+ " cor: "+ C2.get_cor());

        //objeto com contrustor de 1 parâmetro
        Circulo C3 = new Circulo(10.5f);
        //System.out.println("Objeto C3: raio "+ C3.get_raio()+ " cor: "+ C3.get_cor());
        System.out.println("Objeto C3 : " + C3.toString());
    }
}
