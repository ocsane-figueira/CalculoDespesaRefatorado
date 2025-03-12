import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RelatorioDespesa {
    
    public void imprimirRelatorio(List<Despesa> despesas) {
        System.out.print(gerarRelatorio(despesas));
    }

    private String gerarRelatorio(List<Despesa> despesas) {
        return cabecalho() + corpo(despesas) + resumo(despesas);
    }

    private String cabecalho() {
        return "---------------------Relatório de Despesas---------------------\n";
    }

    private String corpo(List<Despesa> despesas) {
        return despesas.stream()
                .map(this::detalharDespesa)
                .collect(Collectors.joining());
    }

    private String detalharDespesa(Despesa despesa) {
        return despesa.getTipo().getNome() + "\t" + despesa.getValor() + "\t" + (despesa.ehAcimaDoLimite() ? "Gasto acima do limite" : " ") + "\n";
    }

    private String resumo(List<Despesa> despesas) {
        return "Total de refeições: " + somarDespesas(despesas, Despesa::ehComida) + "\n" +
               "Total geral: " + somarDespesas(despesas, d -> true) + "\n";
    }

    private int somarDespesas(List<Despesa> despesas, Predicate<Despesa> filtro) {
        return despesas.stream()
                .filter(filtro)
                .mapToInt(Despesa::getValor)  
                .sum();
    }
}
