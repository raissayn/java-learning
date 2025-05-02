public class ConcIniciais {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); // cria objeto p1
        p1.nome = "Raissa";
        p1.idade = 19;
        p1.apresentar();

        Pessoa p2 = new Pessoa();
        p2.nome = "Carlos";
        p2.idade = 40;
        p2.apresentar();
    }
}
class Pessoa{
    String nome;
    int idade;

    void apresentar (){
        System.out.print("Meu nome é " + nome + " e tenho " + idade + " anos");
    }
}
// JAVA SÓ PODE HAVER UMA ÚNICA CLASSE PUBLIC NO ARQUIVO, E O NOME DO ARQUIVO DEVE SER O NOME DESSA CLASSE!