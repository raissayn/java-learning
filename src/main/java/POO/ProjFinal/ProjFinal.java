package POO.ProjFinal;

public class ProjFinal {
    public static void main(String[] args) {
        // vetor de videos
        Video v[] = new Video [3];
        v[0] = new Video("aula 1 de poo");
        v[1] = new Video("aula 2 de poo");
        v[2] = new Video("aula 3 de poo");

        System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Maria", 22, "F", "maria123");
        g[1] = new Gafanhoto("João", 20, "M", "joao123");
        g[1].setLogin("joao222");
        g[1].visualizarVideo();
        System.out.print(g[1].toString());

        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao( g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());

    }
}
