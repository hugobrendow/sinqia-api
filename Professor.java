import java.util.Scanner;

public class Professor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do professor: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o cpf do professor: ");
        String cpf = scanner.nextLine();

        System.out.printf("Bem-vindo %s", nome);
    }
}
