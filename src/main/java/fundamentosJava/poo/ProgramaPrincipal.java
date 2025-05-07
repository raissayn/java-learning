package fundamentosJava.poo;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        // Criar uma pessoa => intancias (new)
        // tipo(classe) variavel = new classe()
        Pessoa pessoa1 = new Pessoa("Raissa", 19, 1.65, 65);
//
//        pessoa1.setNome("Raissa");
//        pessoa1.setIdade(19);
//        pessoa1.setAltura(1.65);
//        pessoa1.setPeso(65);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura());
        System.out.println(pessoa1.getPeso());
        // ou
        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos" + " e tem " + pessoa1.getAltura() + " de altura" + " e pesa " + pessoa1.getPeso() + "Kg");

        Pessoa pessoa2 = new Pessoa("Maria", 20, 1.70, 80); // com construtor
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getAltura());
        System.out.println(pessoa2.getPeso());

        // APRESENTANDO PELO MÉTODO
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());
    }

}
