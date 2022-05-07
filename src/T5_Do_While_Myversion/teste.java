package T5_Do_While_Myversion;

public class teste {
    public static void main(String[] args) {
       double i = 0.01E-321;
       while(i <= (long)1000000000000000000E+290){
           System.out.println(i);
           i += 0.01E-321;
       }
    }
}
