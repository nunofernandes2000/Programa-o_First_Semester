package Exercícios8;

public class MYCirculo {
    //membros REGRA GERAL OS MEMBROS DEVEM SER SEMPRE PRIVADOS
    //Utilizar um membro publico faz com que a pessoa que programa com o meu objecto utilize diretamente o membro
    private float raio;
    private String cor;
    //public String cordawish;


    //construtor por defeito
    public MYCirculo() {
        raio = 1.0f;
        cor = "branco";
    }

    //gets "Vai Buscar" this torna claro que estou a devolver o raio da linha 5 sende este o raio
    //o this por norma não é necesssário mas identifica o que tenho de devolcer
    public float get_raio() {
        return this.raio;
    }

    public String get_cor() {
        return this.cor;
    }

    //sets não devolve nada mais modifica o valor ou seja é como o get mas não devolve
    public void set_raio(float praio) {
        if (praio > 0)
            this.raio = praio;
        else {
            System.out.println("O raio tem que ser positivo");
            System.out.println("A atribuir valor 1");
            this.raio = 1f;
        }
    }

    public void set_cor(String pcor) {
        //definir conjunto de cores possiveis
        String cores[] = {"amarelo", "verde", "vermelho", "branco", "azul"};
        //garantir que o pcor está em minusculas
        pcor = pcor.toLowerCase();
        //garantir que o pcor existe no vetor Cores
        boolean existe = false;
        int i = 0;
        do {
            if (pcor.equals(cores[i]))
                existe = true;
            i++;

        } while (existe == false && i < cores.length);
        if (existe) {
            this.cor = pcor;
        } else {
            System.out.println("Cor Inválidada a Atribuir cor branca");
            this.cor = "branco";
        }

    }

}
