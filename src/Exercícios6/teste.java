package Exercícios6;

public class teste {
    public static void main(String[] args) {
        double vetor[] = new double[7];
        for(int i = vetor.length-1; i>=0;i--){
            vetor[i] = i*5;
            if(vetor[i]>10)
                System.out.println(vetor[i]);
            else{

            }
        }
    }
}
//1 2 3 4 5 6 7
//double vetor[] = new double[7]
// for(double i = vetor.lenght; i>=0;i--){
// vetor[i] = i*5;
// if(vetor[i]>10)
// System.out.println(vetor[i]);
// else
// }