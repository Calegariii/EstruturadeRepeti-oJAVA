public class QuartoExemploFOR {
    public static void main(String args[]) {
        double valorEmprestimo = Teclado.leDouble("Informe o valor do empréstimo: ");
        int parcelas = Teclado.leInt("Informe a quantidade de parcelas: ");

        double totalComJuros = valorEmprestimo * 1.05; // 5% de juros
        double valorParcela = totalComJuros / parcelas;

        System.out.println("\n--- Simulação das Parcelas (Juros de 5%) ---");
        for (int i = 1; i <= parcelas; i++) {
            System.out.println("Parcela " + i + ": R$ " + String.format("%.2f", valorParcela));
        }
        System.out.println("Valor total a pagar: R$ " + String.format("%.2f", totalComJuros));
    }
}