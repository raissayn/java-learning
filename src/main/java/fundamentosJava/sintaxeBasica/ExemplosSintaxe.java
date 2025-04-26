package fundamentosJava.sintaxeBasica;

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

        // variáveis
        int numero;
        numero = 10;
        System.out.println(numero);
        numero = 15;
        System.out.println(numero);
        // A atribuição ser do tipo declarado
        // numero = "teste".

        int x = 10, y = 11, z = 12;
        System.out.println(x + " " + y + " " + z);

        // Operadores básicos
        // aritmética
        int a = 10;
        int b = 3;
        // subtração -> exibição () resolvido primeiro
        System.out.println("A-B = " + ( a - b ));
        System.out.println("A+B = " + (a + b));
        System.out.println("A/B = " + (a / b));
        System.out.println("A*B = " + (a * b));

        // divisão precisa
        int c = 10;
        int d = 3;
        System.out.println("C/D = " + (c / d));

        // incremento e decremento
        int contador = 0;
        contador++;
        System.out.println("Valor contado: " +(contador));
        contador--;
        contador--;
        contador--;
        System.out.println("Valor contado: " +(contador));

        // operador composto
        System.out.println("Operador composto soma: "+( a+=5 )); // a = a + 5
        System.out.println("Operador composto subtração: "+( b-= 15)); // b = b - 15
        System.out.println("Operador composto multiplicação: "+( b*= 5)); // b = b * 5
    }
}
