package TrabalhoManuel;

public class Aluno extends Pessoa{

    private int numAluno;
    private char codigoCurso;
    private boolean bolseiro;
    private int anoMatricula;

    public Aluno() {
    }

    public Aluno(String nome, String apelido, char genero, int anoNascimento, int numAluno, char codigoCurso, boolean bolseiro, int anoMatricula) {
            super(nome, apelido, genero, anoNascimento);
            this.numAluno = numAluno;
            this.codigoCurso = codigoCurso;
            this.bolseiro = bolseiro;
            this.anoMatricula = anoMatricula;
    }

    // Get Methods
    public int getNumAluno() { return numAluno; }

    public char getCodigoCurso() { return codigoCurso; }

    public boolean isBolseiro() { return bolseiro; }

    public int getAnoMatricula() { return anoMatricula; }

    // Set Methods
    public void setNumAluno(int numAluno) { this.numAluno = numAluno; }

    public void setCodigoCurso(char codigoCurso) { this.codigoCurso = codigoCurso; }

    public void setBolseiro(boolean bolseiro) { this.bolseiro = bolseiro; }

    public void setAnoMatricula(int anoMatricula) { this.anoMatricula = anoMatricula; }

    // Method to change Student
    public void alteraAluno(char codigoCurso, boolean bolseiro) {
        this.codigoCurso = codigoCurso;
        this.bolseiro = bolseiro;
    }

    // Method to calculate Scholarship
    public float calculaPropina(char codigoCurso, boolean bolseiro) {
        float t = 600f;
        float l = 700f;
        float m = 1000f;

        float t_b = t / 2;
        float l_b = l / 2;
        float m_b = m / 2;

        if (codigoCurso == 'T') {
            if (bolseiro) {
                return t_b;
            }
            return t;
        }

        if (codigoCurso == 'L') {
            if (bolseiro) {
                return l_b;
            }
            return l;
        }

        if (codigoCurso == 'M') {
            if (bolseiro) {
                return m_b;
            }
            return m;
        }
        return 0f;
    }

    // toString Method
    @Override
    public String toString () {
        return "Aluno {\n" +
                "   Nome -> '" + getNome() + '\'' + ",\n" +
                "   Apelido -> '" + getApelido() + '\'' + ",\n" +
                "   Género -> " + getGenero() + ",\n" +
                "   Ano Nascimento -> " + getAnoNascimento() + ",\n" +
                "   Num Aluno -> " + numAluno + ",\n" +
                "   Código Curso -> " + codigoCurso + ",\n" +
                "   Bolseiro -> " + bolseiro + ",\n" +
                "   Ano Matrícula -> " + anoMatricula + "\n" +
                '}';
    }
}
