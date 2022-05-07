package Exercícios;

public class Exercicio8 {
    public static void main(String[] args) {
        System.out.println("Este programa compara");
        Boolean a = 10==13;
        Boolean b = 7!=17;
        Boolean c = 23!=23;
        Boolean d = 4>5 && 5>10;
        Boolean e = 7>5 && 10>5;
        Boolean f = 40<100 || 60>100;
        Boolean g = 40<100 && 60>100;
        Boolean h = !(40<100 && 60>100);

        System.out.println("10==13 igual a " +a);
        System.out.println("7!=17 igual a " +b);
        System.out.println("23!=23  igual a " +c);
        System.out.println("4>5 && 5>10 igual a " +d);
        System.out.println("7>5 && 10>5 igual a " +e);
        System.out.println("40<100 || 60>100 igual a " +f);
        System.out.println("40<100 && 60>100 igual a " +g);
        System.out.println("!(40<100 && 60>100) igual a " +h);
    }
}
