package sintaxeBasica;

public class ExemplosSintaxe {
    public static void main(String[] args) {
        // 1- Impressão de texto
        System.out.println("Podemos imprimir texto, e números" + 45);

        // 2 - Tipos primitivos
        // variavel = coloca dados
        // int = integer = inteiro
        int idade = 19;
        int anoAtual = 2025;

        System.out.println("Sua idade é: " + idade + "anos");
        System.out.println("O ano é atual: " + anoAtual);

        // , (BR) => . (EN
        double altura = 1.65;
        double pi = 3.14;
        System.out.println("A minha altura é: "+ altura);
        System.out.println("Valor PI: " + pi);

        // Textos = Strings
        String nome = "Raissa";
        System.out.println("O nome é: " +nome);
        // Boolean -> true or false
        boolean ehMaior = idade > 18;
        System.out.println("Eu sou maior de idade? " + ehMaior);

        boolean estaLogado = true;
        boolean temAcesso = false;
        System.out.println("Estou logado? " + estaLogado);
        System.out.println("Tem acesso? " + temAcesso);
        System.out.println("Estou logado e tem acesso? " + (estaLogado && temAcesso));
    }
}
