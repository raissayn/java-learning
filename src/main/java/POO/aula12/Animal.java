package POO.aula12;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    // metodos abstratos, devem ser sobrepostos dentro da classe que herda
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
