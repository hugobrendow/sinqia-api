import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Bem-vindo %s", nome);
    }
}
