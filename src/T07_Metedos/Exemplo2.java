package T07_Metedos;

public class Exemplo2 {
    public static void main(String[] args) {
       int idade1 = calculaidade_apx(1999);
    int idade2 = calculaidade_apx(1321);
    if(idade1<idade2){
        System.out.println("A primeira pessoa é mais nova");
    }
    else if(idade2<idade1){
        System.out.println("A segunda pessoa é mais nova");
    }
    else{
        System.out.println("As duas pessoas têm a mesma idade");
    }
        }
    public static int calculaidade_apx(int ano_nascimento){
        int idade = 2022-ano_nascimento;
        return idade;
    }
}
