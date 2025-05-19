package POO.aula11;
// HERANÇA PARA DIFERENÇA
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    // metodos
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga!");
    }
    // metodos especiais
    public int getMatricula() {
        return matricula;
    }
}
