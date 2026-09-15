import java.util.Scanner;

public class Teclado {
    private static Scanner scanner = new Scanner(System.in);

    public static String leString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static double leDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. " + mensagem);
            scanner.next();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consome a quebra de linha
        return valor;
    }

    public static int leInt(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. " + mensagem);
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
        return valor;
    }

    public static char leChar(String mensagem) {
        System.out.print(mensagem);
        String entrada = scanner.nextLine();
        return entrada.isEmpty() ? ' ' : entrada.charAt(0);
    }
}