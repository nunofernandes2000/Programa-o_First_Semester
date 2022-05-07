package T2_IO;

public class Exercicio8 {
    public static void main(String[] args) {
        System.out.println("Este programa compara");
       Boolean p;

        p = 10==13;
        System.out.println("10==13 igual a " +p);
        p = 7!=17;
        System.out.println("7!=17 igual a " +p);
        p = 23!=23;
        System.out.println("23!=23  igual a " +p);
        p = 4>5 && 5>10;
        System.out.println("4>5 && 5>10 igual a " +p);
        p = 7>5 && 10>5;
        System.out.println("7>5 && 10>5 igual a " +p);
        p = 40<100 || 60>100;
        System.out.println("40<100 || 60>100 igual a " +p);
        p = 40<100 && 60>100;
        System.out.println("40<100 && 60>100 igual a " +p);
        p = !(40<100 && 60>100);
        System.out.println("!(40<100 && 60>100) igual a " +p);
    }
}

