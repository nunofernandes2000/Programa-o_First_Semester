package Exercícios;
//Elabore um programa que gera e imprime 5 números aleatórios uniformes entre 0 e 1 , o
//seu valor médio, o seu valor mínimo e máximo. Usa Math.random(), Math.min(), e
//Math.max().
public class Exercicio15 {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double media = (a+b+c+d+e)/5;
        //double max = Math.max(a,Math.max(b, Math.max(c,Math.max(d, e))));
        double f = Math.max(a, b);
        double g = Math.max(c, d);
        double h = Math.max(e, a);

        double i = Math.max(f, g);
        double j = Math.max(g, h);

        double k = Math.max(j, i);
        //double min = Math.min(a,Math.min(b, Math.min(c,Math.min(d, e))));
        double f2 = Math.min(a, b);
        double g2 = Math.min(c, d);
        double h2 = Math.min(e, a);

        double i2 = Math.min(f2, g2);
        double j2 = Math.min(g2, h2);

        double k2 = Math.min(j2, i2);


        System.out.println("A variável a é " +a);
        System.out.println("A variável b é " +b);
        System.out.println("A variável c é " +c);
        System.out.println("A variável d é " +d);
        System.out.println("A variável e é " +e);
        System.out.println();
        System.out.println("O minimo é " +k2);
        System.out.println();
        System.out.println("O maximo é " +k);
        System.out.println();
        System.out.println("A média é " +media);
        //System.out.println(max);
        //System.out.println(min);


    }
}
