package AulaJorge;
//Programação orientada a objectos public PAI private FILHO
public class Ex2 {
    int i;

    public static void main(String[] args) {
        System.out.println("Olá a todos");
        String batatas = "fritas";
        correfor(batatas);
//Notar como eu pode chamar de batatas na linha 9 e na linha 15 pode chamar de xpto
// ou seja é indiferente se utlizar um nome de varíavel no correfor da classe publica e utilizar um diferente na privada
    }
//selecionar o for entre os parentises 0/7 clicar botão direito e usar o refactor e clicar depois no extract method
//meti uma string dentro do correfor
    private static void correfor(String xpto) {
        for (int i = 0; i<=10; i++){
            System.out.println(xpto+" =" +" Estou a invocar uma variavel fora da classe");
        }
    }
}
