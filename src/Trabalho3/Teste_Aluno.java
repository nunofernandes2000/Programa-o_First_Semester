/*
Nuno Fernandes 21635
Pedro Andrade 21633

Trabalho nº3 PROGRAMAÇÃO
DWDM 1ºANO 21/22
*/

package Trabalho3;

import java.util.Scanner;

public class Teste_Aluno {
    public static void main(String[] args) {
        char genero, codigocurso;
        int anonascimento, ano, numaluno,anomatricula, anos;
        String nome, apelido;
        boolean bolseiro;
        Aluno AlunoT = new Aluno();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o Numero do Aluno");
        numaluno = teclado.nextInt();
        AlunoT.setnumaluno(numaluno);
        System.out.println("Qual o Ano da Matricula deste aluno");
        anomatricula = teclado.nextInt();
        AlunoT.setanomatricula(anomatricula);
        System.out.println("O aluno é bolseiro? True/False");
        bolseiro = teclado.nextBoolean();
        AlunoT.setbolseiro(bolseiro);
        AlunoT.setcodigocurso('T');

        System.out.println(AlunoT.toString());
        System.out.println("Nº Aluno "+AlunoT.getnumAluno());
        System.out.println("É "+AlunoT.getbolseiro()+" que o aluno seja bolseiro");
        System.out.println("O aluno têm o código curso "+AlunoT.getcodigocurso());
        System.out.println("O aluno fez a matricula no ano "+AlunoT.getanomatricula());
        System.out.println("O aluno Nº "+AlunoT.getnumAluno()+" vai ingressar numa licenciatura vai poder usufruir de bolsa?");
        bolseiro = teclado.nextBoolean();
        AlunoT.setbolseiro(bolseiro);
        AlunoT.setcodigocurso('L');
        System.out.println(AlunoT.toString()+" tendo este anteriormente pertencido a um CTESP"+"\n");

        Aluno AlunoL = new Aluno();
        System.out.println("Qual o Numero do Aluno");
        numaluno = teclado.nextInt();
        AlunoL.setnumaluno(numaluno);
        System.out.println("Qual o Ano da Matricula deste aluno");
        anomatricula = teclado.nextInt();
        AlunoL.setanomatricula(anomatricula);
        System.out.println("O aluno é bolseiro? True/False");
        bolseiro = teclado.nextBoolean();
        AlunoL.setbolseiro(bolseiro);
        AlunoL.setcodigocurso('L');

        System.out.println(AlunoL.toString());
        System.out.println("Nº Aluno "+AlunoL.getnumAluno());
        System.out.println("É "+AlunoL.getbolseiro()+" que o aluno seja bolseiro");
        System.out.println("O aluno têm o código curso "+AlunoL.getcodigocurso());
        System.out.println("O aluno fez a matricula no ano "+AlunoL.getanomatricula()+"\n");

        Aluno AlunoM = new Aluno();
        System.out.println("Qual o Numero do Aluno");
        numaluno = teclado.nextInt();
        AlunoM.setnumaluno(numaluno);
        System.out.println("Qual o Ano da Matricula deste aluno");
        anomatricula = teclado.nextInt();
        AlunoM.setanomatricula(anomatricula);
        System.out.println("O aluno é bolseiro? True/False");
        bolseiro = teclado.nextBoolean();
        AlunoM.setbolseiro(bolseiro);
        AlunoM.setcodigocurso('M');

        System.out.println(AlunoM.toString());
        System.out.println("Nº Aluno "+AlunoM.getnumAluno());
        System.out.println("É "+AlunoM.getbolseiro()+" que o aluno seja bolseiro");
        System.out.println("O aluno têm o código curso "+AlunoM.getcodigocurso());
        System.out.println("O aluno fez a matricula no ano "+AlunoM.getanomatricula());

    }


}

