package Exercícios8;

public class MYteste_circulo {
    public static void main(String[] args) {
        //construir um objeto da classe circulo
        MYCirculo C1 = new MYCirculo();
        System.out.println(C1.get_cor());
        System.out.println(C1.get_raio());
        System.out.println("Valor Inicial do rao: "+ C1.get_raio());
        C1.set_raio(4.5f);
        System.out.println("Agora o raio é "+ C1.get_raio());
        //***
        C1.set_cor("Amarelo Canário");
    }
}
