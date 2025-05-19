package POO.aula11;

public class Tecnico extends Aluno{
    private String registroProfissional;
    // métodos especiais
    public void praticar(){
        System.out.println("Tecnico" + this.getNome() + "está praticando!");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "registroProfissional='" + registroProfissional + '\'' +
                '}';
    }
}
