package POO.ProjFinal;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    @Override
    public void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }

    // PRESTA ATENÇÃO
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); // pegando da classe MÃE!!!!
        this.login = login;
        this.totAssistido = 0;
    }

    //metodo
    public void visualizarVideo() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    //getters e setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        System.out.println("Gafanhoto{" +  super.toString() + login + ", totAssistido=" + totAssistido + '}');
        return "";
    }
}
