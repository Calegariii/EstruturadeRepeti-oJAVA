public class CaixaEletronico {
    public static void main(String args[]) {
        ContaCorrente conta = new ContaCorrente(600.00);
        int opcao;

        do {
            System.out.println("\n======== MENU CAIXA ELETRÔNICO ========");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Retirada");
            System.out.println("4 - Empréstimo");
            System.out.println("5 - Sair");
            System.out.println("=======================================");

            opcao = Teclado.leInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    conta.consultaSaldo();
                    break;
                case 2:
                    conta.deposito();
                    break;
                case 3:
                    conta.retirada();
                    break;
                case 4:
                    conta.emprestimo();
                    break;
                case 5:
                    System.out.println("Sessão finalizada. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 5);
    }
}