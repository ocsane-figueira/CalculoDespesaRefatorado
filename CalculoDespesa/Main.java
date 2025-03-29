import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DespesaBase> despesas = Arrays.asList(
            new DespesaAlimenticia(TipoDespesa.JANTAR, 6000),
            new DespesaAlimenticia(TipoDespesa.ALMOCO, 1500),
            new DespesaAlimenticia(TipoDespesa.CAFE_DA_MANHA, 1100),
            new Despesa(TipoDespesa.ALUGUEL_CARRO, 10000)
        );

        RelatorioDespesa relatorio = new RelatorioDespesa();
        relatorio.imprimirRelatorio(despesas);
    }
}

