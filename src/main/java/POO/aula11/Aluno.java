package POO.aula11;
// HERANÇA PARA DIFERENÇA
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    // metodos
    // MÉTODO FINAL, PUBLIC FINAL VOID = NÃO PODE SER SOBREEPOSTO
    // OU PUBLIC FINAL CLASSE = PARA NÃO TER FILHO!!!
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga do aluno: " + this.getNome());
    }
    // metodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
