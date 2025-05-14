package POO.aula08;

import java.util.Random;

// relação de agregação
public class Luta {
    // atributos
    private Lutador desafiado; // desafiado vai ser instancia de lutador
    private Lutador desafiante; // desafiante vai ser instancia de lutador
    private int rounds;
    private boolean aprovada;

    //métodos
    public void marcarLuta(Lutador l1, Lutador l2){  // tem que ter lutadores para marcar
    if ( l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
        setAprovada(true);
        setDesafiado(l1);
        setDesafiante(l2);
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.isAprovada()){
        this.desafiado.apresentar();
        this.desafiante.apresentar();
        Random aleatório = new Random(); // escolha de número aleatório para RESULTADO LUTA
            int vencedor = aleatório.nextInt(3); // 0 , 1 , 2
            switch (vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:// SE 1 = GANHOU DESAFIADO
                    System.out.println(desafiado.getNome() + " venceu!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

                case 2:// SE 2 = GANHOU DESAFIANTE
                    System.out.println(desafiante.getNome() + " venceu!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                }
            } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
    //métodos especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
