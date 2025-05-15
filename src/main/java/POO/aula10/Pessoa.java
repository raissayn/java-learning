package POO.aula10;
// classe mãe / superclasse / progenitora

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniv(){
        this.idade++;
    }

    // metodos especiais
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // LEMBRAR!
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
