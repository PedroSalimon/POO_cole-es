package Exec_01;

public class Candidato {

    private double nota;
    private String nome;
    private long anos;

    public Candidato(double nota, String nome, long anos) {
        this.nota = nota;
        this.nome = nome;
        this.anos = anos;
    }

    public String toString() {
        return String.format("Nota = %.2f | Anos de exp = %d | Nome = %S", nota, anos, nome);
    }


    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getAnos() {
        return anos;
    }

    public void setAnos(long anos) {
        this.anos = anos;
    }
}
