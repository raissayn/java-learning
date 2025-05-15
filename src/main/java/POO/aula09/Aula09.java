package POO.aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 23, 'M');
        p[1] = new Pessoa("Maria", 17,'F');

        l[0] = new Livro("Java", "Pedro", 200, p[0]);
        l[1] = new Livro("C", "Maria", 300, p[1]);
        l[2] = new Livro("Python", "Maria", 400, p[1]);

        l[0].detalhes();

    }
}
