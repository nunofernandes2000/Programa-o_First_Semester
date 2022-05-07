package Exercícios8;

public class Circulo{
    //membros
    private float raio;
    private String cor;

    //construtor por defeito
    public Circulo(){
        raio = 1.0f;
        cor = "branco";
    }

    public Circulo(float pRaio, String pCor){
        set_cor(pCor);
        set_raio(pRaio);
    }
    public Circulo(float pRaio){
        set_raio(pRaio);
        this.cor = "branco";
    }

    //gets
    public float get_raio(){
        return this.raio;
    }

    public String get_cor(){
        return this.cor;
    }

    //sets
    public void set_raio(float pRaio){
        if(pRaio>0)
            this.raio = pRaio;
        else{
            System.out.println("Raio tem que ser positivo");
            System.out.println("A atribuir valor 1");
            this.raio = 1.0f;
        }
    }

    public void set_cor(String pCor){
        //definir conjunto de cores possiveis
        String cores[]={"amarelo", "verde", "encarnado", "branco", "azul"};
        //garantir que pCor está em minuscular
        pCor = pCor.toLowerCase();

        //garantir que pCor existe no vetor Cores
        boolean existe= false;
        int i=0;
        do{
            if(pCor.equals(cores[i]))
                existe = true;
            i++;
        }while(existe == false && i<cores.length );
        //}while(!existe  && i<cores.length );

        if(existe) {
            this.cor = pCor;
        }
        else {
            System.out.println("Cor inválida. Vou atribuir cor branco");
            this.cor = "branco";

        }

    }

    public float calculaArea(){
        float area;
        area =(float)Math.PI*this.raio*this.raio;
        return area;

    }
    //override do método toString
    public String toString(){
        String info;
        info = "[RAIO: "+this.raio +", COR: "+ this.cor;
        info += ", AREA: "+calculaArea();
        info +="]";
        return info;
    }


}
