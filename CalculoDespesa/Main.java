
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Despesa despesa1 = new Despesa(TipoDespesa.JANTAR, 6000);
        Despesa despesa2 = new Despesa(TipoDespesa.CAFE_DA_MANHA, 800);
        Despesa despesa3 = new Despesa(TipoDespesa.ALUGUEL_CARRO, 20000);

        List<Despesa> listaDespesas = List.of(despesa1, despesa2, despesa3);
        // Criando o relatório de despesas
        RelatorioDespesa relatorio = new RelatorioDespesa();
        relatorio.imprimirRelatorio(listaDespesas);
    }
}
