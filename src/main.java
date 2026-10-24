
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        animal gato = new gato();
        animal cachorro = new cachorro();

        do {
            System.out.println("\n=== MENU DOS ANIMAIS ===");
            System.out.println("1 - Gato");
            System.out.println("2 - Cachorro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> gato.emitirsom();
                case 2 -> cachorro.emitirsom();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Escolhe certo!!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
