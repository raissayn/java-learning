package POO.aula11;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAum(float valorAum){
        this.salario += valorAum;
    }
}
