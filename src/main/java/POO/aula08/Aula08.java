package POO.aula08;

public class Aula08 {
    public static void main(String[] args) {
        Lutador L[] = new Lutador[5]; // Trabalhando com VETOR!
        L[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        L[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        L[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);


        Luta UECO1 = new Luta(); // COMO CHAMAR LUTA !!! PRESTAR ATENÇÃO
        UECO1.marcarLuta(L[0], L[0]);
        UECO1.lutar();
    }
}
