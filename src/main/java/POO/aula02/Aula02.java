package POO.aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // instanciando
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();
        c1.status(); // chamando método

        System.out.println("=======================");

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 80;
        c2.tampar();
        c2.status();
        c2.rabiscar();

        Livro l1 = new Livro();
        l1.titulo = "Java Avançado";
        l1.autor = "Jhones Matia";
        l1.paginas = 150;
        l1.aberto = false;
        l1.pagAtual = 10;
        l1.abrir();
        l1.folhear(100);
        l1.status();
        l1.avancarPag();
        l1.status();

    }
}
