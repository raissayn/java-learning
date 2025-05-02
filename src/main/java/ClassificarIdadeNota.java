import java.util.Scanner;

public class ClassificarIdadeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CLassificar Idade e Nota, Digite 1 para classificar idade e 2 para classificar nota: ");
        int classifica = scanner.nextInt();
        if (classifica == 1) {
            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade!");
            } else {
                System.out.println("Menor de idade!");
            }
        } else if (classifica == 2) {
            System.out.println("Digite a sua nota: ");
            int nota = scanner.nextInt();
            if (nota >= 6) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
        } else {
            System.out.print("Operação inválida!");
        }
        scanner.close();
    }
}
