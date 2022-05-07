package Exercícios8;
//classe Cilindro é classe derivada (ou filha, ou subclasse)
// da classe base (ou mae, ou superclasse) Circulo
//um cilindro é um circulo com uma altura
public class Cilindro extends Circulo {

    private float altura;

    //construtor por defeito
    public Cilindro(){
        super(); //invoca o construtor por defeito da classe  mae
        altura = 1.0f;
    }

    //construtor com parametros
    public Cilindro(float pRaio, String pCor, float pAltura){
        super(pRaio,pCor);
        set_altura(pAltura);
    }

    public  float get_altura(){
        return this.altura;
    }

    public void set_altura(float pAltura){
        if(pAltura>0)
            this.altura = pAltura;
        else{
            System.out.println("Altura tem que ser positiva");
            System.out.println("A atribuir valor 1");
            this.altura = 1.0f;
        }
    }

    public float calculaVolume(){
        //o volume do cilindro é a área do circulo * altura.
        return super.calculaArea()*this.altura;
    }


    public String toString(){
        String info = super.toString();
        info += " Altura : "+ this.altura;
        return info;
    }



}
