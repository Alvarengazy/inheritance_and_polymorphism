import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        gato gato = new gato();
        cachorro cachorro = new cachorro();
        




        do {
            System.out.println("1 - Gato");
            System.out.println("2 - Cachorro");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> gato.emitirsom();
                case 2 -> cachorro.emitirsom();  
                default -> System.out.println("Escolhe certo, viado");
                    
            }
        } while (opcao !=0);
    }
}
