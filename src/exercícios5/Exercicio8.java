package exercícios5;

public class Exercicio8 {
    public static void main(String[] args) {
        int fat=10, resultado = 1;


                for (int num = 8; num > 1; num--) {
                    int num2 = num;
                    for(num2--;num2<= 1;){
                        resultado = num2 * resultado;
                    }System.out.println(resultado);
                }

                //Não fazer esta volta toda para a proxima
                /*if (fat >= 3 || fat <= -3) {
                    resultado = (resultado * resultado) / resultado;
                    System.out.println("O fatorial de " + fat + " é: " + resultado);
                } else if (fat == 2 || fat == -2) {
                    System.out.println("2");
                } else if (fat == 1 || fat == -1 || fat == 0) {
                    System.out.println("1");
                }
            } else {
                System.out.println("\nIntruduza um numero válido");*/
    }
}
