package TrabalhoManuel;

public class Pessoa {

    // Variables from Pessoa Class
    private String nome;
    private String apelido;
    private char genero;
    private int anoNascimento;

    // Default constructor
    public Pessoa() {
    }

    // Constructor with parameters
    public Pessoa(String nome, String apelido, char genero, int anoNascimento) {
        this.nome = nome;
        this.apelido = apelido;
        this.genero = genero;
        this.anoNascimento = anoNascimento;
    }

    // Get Methods
    public String getNome() { return nome; }

    public String getApelido() { return apelido; }

    public char getGenero() { return genero; }

    public int getAnoNascimento() { return anoNascimento; }

    // Set Methods
    public void setNome(String nome) { this.nome = nome; }

    public void setApelido(String apelido) { this.apelido = apelido; }

    public void setGenero(char genero) { this.genero = genero; }

    public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }

    // Method to calculate total age
    public int calculaIdade(int anoAtual, int anoNascimento) {
        int idadeTotal = anoAtual - anoNascimento;

        if (anoAtual < anoNascimento) {
            return 0;
        }

        return idadeTotal;
    }

    // toString method
    @Override
    public String toString() {
        return "Pessoa {" +
                "nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", genero=" + genero +
                ", anoNascimento=" + anoNascimento +
                '}';
    }
}
