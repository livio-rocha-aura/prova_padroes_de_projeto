public class MotoristaParceiroFrotista extends Motorista {
    private static final double TAXA_PLATAFORMA = 0.20;
    private static final double TAXA_ALUGUEL_VEICULO = 800.00;

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double valorLiquido = getValorTotalBruto() * (1 - TAXA_PLATAFORMA);
        valorLiquido -= TAXA_ALUGUEL_VEICULO;

        return Math.max(0.0, valorLiquido);
    }
}
