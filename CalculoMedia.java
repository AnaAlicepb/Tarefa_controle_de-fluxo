import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média das quatro notas é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("O aluno está aprovado.");
        } else if (media >= 5) {
            System.out.println("O aluno está de recuperação.");
        } else {
            System.out.println("O aluno está reprovado.");
        }

        scanner.close();
    }
}
