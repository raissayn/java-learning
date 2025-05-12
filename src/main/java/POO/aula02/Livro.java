package POO.aula02;

public class Livro {
    String titulo;
    String autor;
    int paginas;
    boolean aberto;
    int pagAtual;
    void status(){
        System.out.println("O livro " + this.titulo + ", do autor : " + this.autor + ", está " + (this.aberto ? "Aberto" : "Fechado"));
        System.out.println("Está na página: " + this.pagAtual);
        System.out.println("Quantidade de páginas: " + this.paginas);
    }
    void abrir(){
        this.aberto = true;
    }
    void fechar(){
        this.aberto = false;
    }
    void folhear(int p){
        this.pagAtual = p;
    }
    void avancarPag(){
        this.pagAtual++;
    }
    void voltarPag(){
        this.pagAtual--;
    }
}
