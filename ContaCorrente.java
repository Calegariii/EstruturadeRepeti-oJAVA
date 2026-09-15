public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void consultaSaldo() {
        System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
    }

    public void deposito() {
        double valor = Teclado.leDouble("Informe o valor para depósito: ");
        while (valor <= 0) {
            System.out.println("Valor inválido! O valor deve ser maior que zero.");
            valor = Teclado.leDouble("Informe um valor válido para depósito: ");
        }
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        consultaSaldo();
    }

    public void retirada() {
        double valor = Teclado.leDouble("Informe o valor para retirada: ");
        while (valor > this.saldo) {
            System.out.println("Saldo indisponível para este valor de retirada.");
            valor = Teclado.leDouble("Informe um novo valor para retirada: ");
        }
        this.saldo -= valor;
        System.out.println("Retirada realizada com sucesso!");
        consultaSaldo();
    }

    public void emprestimo() {
        double valor = Teclado.leDouble("Informe o valor do empréstimo: ");
        int parcelas = Teclado.leInt("Informe a quantidade de parcelas: ");

        double totalComJuros = valor * 1.05;
        double valorParcela = totalComJuros / parcelas;

        System.out.println("\n--- Detalhamento das Parcelas ---");
        for (int i = 1; i <= parcelas; i++) {
            System.out.println("Parcela " + i + ": R$ " + String.format("%.2f", valorParcela));
        }

        this.saldo += valor;
        System.out.println("Empréstimo creditado em sua conta!");
        consultaSaldo();
    }
}