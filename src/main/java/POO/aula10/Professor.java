package POO.aula10;
// subclasse

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(float valorAum){
        this.salario = this.salario + valorAum;
        // this.salario += valorAum;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
