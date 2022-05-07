package AulaJorge;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3 {


    int i;




    public static void main(String[] args) throws IOException {
        FileWriter FileWriter = new FileWriter("teste2.txt");
        FileWriter.write("Ola todos 2");
        FileWriter.close();



        /*System.out.println("ola a todos");

        String batatas = "ajhgiahugahuga";
        try {
            correFor(batatas);
        } catch (Exception e) {
            System.out.println("Olha isto deu erro fixe apanhei o erro");
            e.printStackTrace();
        }

    }



    private static void correFor(String xpto) throws Exception {

        int i = 0;
        //new FileWriter("teste.txt");
        for ( i = 0 ; i < 10 ; i++){

            System.out.println(xpto+ " = " + i); // usei o soutv-dica importante
        }

        throw  new Exception("Porque sim");

        //return i;
         */
    }



}
