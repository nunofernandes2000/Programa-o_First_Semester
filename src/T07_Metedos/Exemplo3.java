package T07_Metedos;

public class Exemplo3 {
    public static void main(String[] args) {
        int ano = 2005;
    int idade = calculaidade_apx(ano);
        // hamaioridade(idade);
hamaioridade(calculaidade_apx(ano));
        System.out.println("Têm maioridade?");
        System.out.println(hamaior(idade));
    hamaior(idade);

    }
    public static int calculaidade_apx(int ano_nascimento){
        int idade_apx = 2022-ano_nascimento;
        return idade_apx;
    }
    public static void hamaioridade(int idade){
        if(idade >= 18)
            System.out.println("Tem maioridade");
    else
            System.out.println("Não tem maioridade");
    }
    public static boolean hamaior(int idade){
        boolean emaior;
        if(idade>=18)
            emaior=true;
    else
        emaior = false;


    return emaior;
    }
}
