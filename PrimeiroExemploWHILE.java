// classe de teste
public class PrimeiroExemploWHILE {
    // método main da classe de teste
    // responsável pela execução dos comandos
    public static void main(String args[]) {
        // criando a variável saldo
        double saldo = 600.00;

        // criando a variável retirada e lendo o valor do teclado
        double retirada = Teclado.leDouble("Informe um valor para retirada: ");

        // enquanto o valor da retirada for superior ao saldo[cite: 1]
        // será solicitado para o usuário informar um novo valor para retirada[cite: 1]
        while (retirada > saldo) {
            System.out.println("Saldo indisponivel para este valor de retirada.");
            retirada = Teclado.leDouble("Informe um novo valor para retirada: ");
        }

        // calcula novo saldo[cite: 1]
        saldo = saldo - retirada;

        // apresenta novo saldo[cite: 1]
        System.out.println("Seu novo saldo é: " + saldo);
    }
}