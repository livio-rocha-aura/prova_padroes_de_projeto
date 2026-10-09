public class MotoristaIniciante extends Motorista {
    private static final double TAXA_PLATAFORMA = 0.25;
    private static final double TAXA_INATIVIDADE = 50.00;
    private static final int LIMITE_CORRIDAS = 5;

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double valorLiquido = getValorTotalBruto() * (1 - TAXA_PLATAFORMA);

        if (getQuantidadeCorridas() < LIMITE_CORRIDAS) {
            valorLiquido -= TAXA_INATIVIDADE;
        }

        return valorLiquido;
    }
}
