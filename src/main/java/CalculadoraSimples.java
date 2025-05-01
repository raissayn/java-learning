import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        System.out.println("Calculadora Simples");
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Escolha da operação
        System.out.println("Escolha a operação: +  -  *  /");
        char operacao = scanner.next().charAt(0);

        double resultado;

        // Cálculo com switch
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        scanner.close();
    }
}

