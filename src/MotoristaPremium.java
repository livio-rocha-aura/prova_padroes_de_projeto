public class MotoristaPremium extends Motorista {
    private static final double TAXA_PLATAFORMA = 0.15;
    private static final double BONUS_POR_CORRIDA = 2.00;
    private static final int CORRIDAS_SEM_BONUS = 10;

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        int corridasComBonus = Math.max(0, getQuantidadeCorridas() - CORRIDAS_SEM_BONUS);
        double bonus = corridasComBonus * BONUS_POR_CORRIDA;
        double valorBrutoComBonus = getValorTotalBruto() + bonus;

        return valorBrutoComBonus * (1 - TAXA_PLATAFORMA);
    }
}
