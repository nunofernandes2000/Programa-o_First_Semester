package T07_Metedos;
//Exemplo metedos tipo void
public class exemplo1 {
    public static void main(String[] args) {
        olamundo("Anastácio");
        String a = "helena";
        olamundo(a);
        BoasVindas("Ana",2002);
        int carros = 2;
        for(int i=0;i<=10;i++){
            olamundo();
        }
    }
    private static void olamundo(){
        System.out.println("Olá Mundo!");
        System.out.println("Feliz Ano Novo!");
    }
    public static void olamundo(String nome){
        System.out.println("Sê bem vindo "+ nome);
    }
    public static void BoasVindas(String nome, int ano){
        System.out.println("Sê bem vindo "+ nome);
        int idade = 2022-ano;
        System.out.println("Tens "+idade+" anos.");
    }
}
