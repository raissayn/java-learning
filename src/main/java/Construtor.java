
class Aluno {
    String nome;
    int idade; // int letra minúscula

    // CONSTRUTOR
    public Aluno(String nome, int idade){
        this.nome = nome; // this.nome recebe valor de p1
        this.idade = idade; // this.idade recebe valor de p1
        // his é usado para diferenciar o atributo da classe
        // do parâmetro do método/construtor quando os dois têm o mesmo nome.
    }
}
public class Construtor {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("Raissa", 19);
        System.out.println("Nome: " + p1.nome + "  -  Idade: " + p1.idade);
    }
}
