public class Main {
    public static void main(String[] args) {
        Motorista iniciante = new MotoristaIniciante("Ana Lima", "ABC-1234");
        Motorista premium = new MotoristaPremium("Bruno Souza", "DEF-5678");
        Motorista parceiroFrotista = new MotoristaParceiroFrotista("Carla Mendes", "GHI-9012");

        registrarCorridas(iniciante, 100.00, 150.00, 200.00);
        registrarCorridas(premium, 100.00, 100.00, 100.00, 100.00, 100.00,
                100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00);
        registrarCorridas(parceiroFrotista, 300.00, 300.00);

        Motorista[] motoristas = {iniciante, premium, parceiroFrotista};
        imprimirExtratos(motoristas);
    }

    private static void registrarCorridas(Motorista motorista, double... valores) {
        for (double valor : valores) {
            motorista.registrarCorrida(valor);
        }
    }

    private static void imprimirExtratos(Motorista[] motoristas) {
        System.out.println("===== EXTRATO DOS MOTORISTAS =====");

        for (Motorista motorista : motoristas) {
            System.out.println("----------------------------------");
            System.out.println("Nome: " + motorista.getNome());
            System.out.println("Placa: " + motorista.getPlacaVeiculo());
            System.out.println("Quantidade de corridas: " + motorista.getQuantidadeCorridas());
            System.out.printf("Valor bruto: R$ %.2f%n", motorista.getValorTotalBruto());
            System.out.printf("Valor líquido a receber: R$ %.2f%n", motorista.calcularPagamentoLiquido());
        }

        System.out.println("----------------------------------");
    }
}
