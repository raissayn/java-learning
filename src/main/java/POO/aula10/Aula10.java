package POO.aula10;

import java.sql.SQLOutput;

public class Aula10 {
    public static void main(String[] args) {
        // 4 pessoas de diferentes classes
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Maria");
        p2.setNome("Pedro");
        p3.setNome("João");
        p4.setNome("José");

        p3.receberAum(500f);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
