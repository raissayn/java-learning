package POO.aula11;

public class Aula11{
    public static void main(String[] args) {
//        Visitante v1 = new Visitante();
//        v1.setNome("Maria");
//        v1.setIdade(22);
//        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("João");
        a1.setIdade(25);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Maria");
        b1.setIdade(23);
        b1.setCurso("Informática");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        Professor p1 = new Professor();
        p1.setNome("Maria");
        p1.setSalario(1000f);
        p1.setEspecialidade("Engenharia");
        System.out.println(p1.toString());

        Tecnico t1 = new Tecnico();
        t1.setNome("João");
        t1.setIdade(35);
        t1.setCurso("Informática");
        t1.setRegistroProfissional("AMEND");
        t1.pagarMensalidade();
        System.out.println(t1.toString());
    }
}
