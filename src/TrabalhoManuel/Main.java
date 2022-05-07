package TrabalhoManuel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Aluno> listaAlunos = new ArrayList<>();
    public static boolean isWelcomeScreen = true;

    public static void main(String[] args) {
        welcomeMenu();
    }

    private static void welcomeMenu() {
        if (isWelcomeScreen) {
            System.out.println("===================================");
            System.out.println("             Bem-vindo!            ");
            System.out.println("-----------------------------------");
            System.out.println("Menu");
        } else {
            System.out.println("===================================");
            System.out.println("Menu-------------------------------");
        }
        System.out.println("(1) -> Students list;");
        System.out.println("(2) -> Create new Student;");
        System.out.println("(3) -> Delete Student;");
        System.out.println("(4) -> Platform Menu");
        System.out.println("(5) -> Exit application;");
        System.out.print("Option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                studentsList();
                break;
            case 2:
                Aluno aluno = createNewStudent();
                listaAlunos.add(aluno);
                break;
            case 3:
                if (!listaAlunos.isEmpty()) {
                    deleteStudent();
                } else {
                    System.out.println("Lista de alunos vazia.");
                }
                break;
            case 4:
                platformMenu();
                break;
            case 5:
                return;
            default:
                System.err.println("You must enter correct values");
        }
        isWelcomeScreen = false;
        welcomeMenu();
    }

    private static void studentsList() {
        if (!listaAlunos.isEmpty()) {
            for (Object o : listaAlunos) {
                System.out.println("\n============================================================================================\n");
                System.out.println(o);
            }
        } else {
            System.out.println("===================================");
            System.out.println("Lista de Alunos está vazia!".toUpperCase());
        }
    }

    private static void platformMenu() {
        if (listaAlunos.isEmpty()) {
            System.err.println("You must create new student to enter this menu!");
            isWelcomeScreen = false;
            welcomeMenu();
        }
        System.out.println("===================================");
        System.out.println("Menu e-Plataforma-------------------------------");
        System.out.println("(1) -> Alterar Aluno (Código Curso, Bolseiro);");
        System.out.println("(2) -> Calcular propina de Aluno;");
        System.out.println("(3) -> Calcular idade de Aluno;");
        System.out.println("(4) -> Ir para menu principal;");
        System.out.println("(5) -> Sair da applicação;");
        System.out.print("Opção: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                changeStudent();
                break;
            case 2:
                calculateScholarship();
                break;
            case 3:
                calculateAge();
                break;
            case 4:
                welcomeMenu();
                break;
            case 5:
                return;
            default:
                System.err.println("Tem de inserir uma opção válida!");
        }
        isWelcomeScreen = false;
        platformMenu();

    }

    // Method to display list of students and ask user option input
    private static void changeStudent() {
        for (Object o : listaAlunos) {
            System.out.println(o);
        }
        System.out.print("Selecione o Num de Aluno que deseja alterar (Num Aluno): ");
        int option = scanner.nextInt(); // Option given by user

        // Loop to students list and change student selected
        loopChangeStudentNumber(option);
    }
    // Method to loop through students list and change students attributes
    private static void loopChangeStudentNumber(int option) {
        for (Aluno aluno : listaAlunos) {
            int numAluno = aluno.getNumAluno();
            if (option == numAluno) {
                // Print student to screen
                System.out.println(aluno);
                System.out.println("--------------------------------");
                System.out.println("Alterar código curso:");
                System.out.println("(T) -> CteSP;");
                System.out.println("(L) -> Licenciatura;");
                System.out.println("(M) -> Mestrado;");
                System.out.print("Opção: ");
                char codigoCurso = scanner.next().toUpperCase().charAt(0);

                System.out.println("--------------------------------");
                System.out.println("Alterar atributo bolseiro:");
                System.out.println("(Y) -> Atribuir atributo bolseiro;");
                System.out.println("(N) -> Remover atributo bolseiro;");
                System.out.print("Opção: ");
                char answer = scanner.next().toUpperCase().charAt(0);
                boolean bolseiro = changeToBooleanState(answer);

                // Change student
                aluno.alteraAluno(codigoCurso, bolseiro);
                System.out.println("Num Aluno: '" + numAluno + "' foi alterado com sucesso!");
                System.out.println("------------------------------------------------");
                System.out.println("Atributos alterados:");
                System.out.println("(Código Curso) -> " + aluno.getCodigoCurso());
                System.out.println("(Bolseiro) -> " + aluno.isBolseiro());
                return;
            }
            System.err.println("O Num Aluno '" + option + "' NÃO EXISTE!");
        }
    }

    // Method to calculate ScholarShip from selected student
    private static void calculateScholarship() {
        for (Object o : listaAlunos) {
            System.out.println(o);
        }
        System.out.print("Selecione o Num de Aluno que deseja calcular a propina (Num Aluno): ");
        int option = scanner.nextInt();

        for (Aluno aluno : listaAlunos) {
            int numAluno = aluno.getNumAluno();
            if (option == numAluno) {
                String discountValue;
                char codigoCurso = aluno.getCodigoCurso();
                boolean bolseiro = aluno.isBolseiro();

                if (bolseiro) {
                    discountValue = "50% desconto;";
                } else {
                    discountValue = "sem desconto aplicado, o aluno não é bolseiro;";
                }
                float propinaTotal = aluno.calculaPropina(codigoCurso, bolseiro);

                if (propinaTotal != 0f) {
                    System.out.println("------------------------------------");
                    System.out.println("Propina -> " + propinaTotal + "€ -> " + discountValue);
                }
            } else {
                System.out.println("Num aluno: '" + option + "', não existe!");
            }
        }
    }

    private static void calculateAge() {
        for (Object o : listaAlunos) {
            System.out.println("\n" + o);
        }
        System.out.print("\nSelecione o Num Aluno que deseja calcular a idade -> ");
        int option = scanner.nextInt();

        for (Aluno aluno : listaAlunos) {
            int numAluno = aluno.getNumAluno();
            if (option == numAluno) {
                int idade = aluno.calculaIdade(2021, aluno.getAnoNascimento());
                System.out.println("\nAluno '" + numAluno + "' tem " + idade + " anos de idade.\n");
            }
        }
    }

    // Method to create new Student
    private static Aluno createNewStudent() {
        scanner = new Scanner(System.in);
        // First name
        System.out.print("Insira o seu primeiro nome: ");
        String nome = scanner.nextLine();
        // Last name
        System.out.print("Insira o seu apelido: ");
        String apelido = scanner.nextLine();
        // Genre
        System.out.print("Insira o seu género (M/F): ");
        char genero = scanner.nextLine().toUpperCase().charAt(0);
        // Year of Birth
        System.out.print("Insira o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        // Student number
        System.out.print("Insira o número de aluno: ");
        int numAluno = scanner.nextInt();
        // Course code (T/L/M)
        System.out.println("Insira o código de curso ");
        System.out.println("(T) -> CteSP;");
        System.out.println("(L) -> Licenciatura;");
        System.out.println("(M) -> Mestrado");
        System.out.print("Opção: ");
        char codigoCurso = scanner.next().toUpperCase().charAt(0);
        // Scholarship
        System.out.print("É bolseiro? (Y/N):");
        char result = scanner.next().toUpperCase().charAt(0); // Receive char (Y/N)
        boolean bolseiro = changeToBooleanState(result); // Convert to boolean
        // Year of course enroll
        System.out.print("Insiro o ano de matrícula: ");
        int anoMatricula = scanner.nextInt();
        // Create new Student object and give parameters from scanner variables input
        Aluno aluno = new Aluno(nome, apelido, genero, anoNascimento, numAluno, codigoCurso, bolseiro, anoMatricula);
        // Final result message from student created
        System.out.println("============================");
        System.out.println("          SUCESSO!          ");
        System.out.println("============================");
        System.out.println("\n" + aluno);

        return aluno;
    }

    // Method to delete student from students list
    private static void deleteStudent() {
        System.out.println("Selecione o aluno a remover (Num Aluno) \n");
        for (Object o : listaAlunos) {
            System.out.println(o);
        }
        System.out.print("\nNum Aluno: ");
        int option = scanner.nextInt();

        System.out.print("Tem a certeza que deseja remover o aluno '" + option + "'? (Y/N): ");
        char result = scanner.next().toUpperCase().charAt(0);
        boolean answer = changeToBooleanState(result);

        if (answer) {
            for (int i = 0; i < listaAlunos.size(); i++) {
                Aluno aluno = listaAlunos.get(i);
                int numAluno = aluno.getNumAluno();
                if (option == numAluno) {
                    listaAlunos.remove(aluno);
                    String nome = aluno.getNome() + " " + aluno.getApelido();
                    System.out.println("Num Aluno '" + numAluno +"', com o nome '" + nome + "', foi removido com SUCESSO!");
                    return;
                }
                System.err.println("O Num Aluno '" + option + "' NÃO EXISTE!");
            }
        }
        System.err.println("Mudanças não aplicadas.");
    }

    /**
     * @param result receives a char (Y/N) and returns true or false
     * @return This method will return boolean from answer given (Y/N)
     */
    private static boolean changeToBooleanState(char result) {
        String resultToString = String.valueOf(result);
        return !resultToString.equals("N");
    }
}
