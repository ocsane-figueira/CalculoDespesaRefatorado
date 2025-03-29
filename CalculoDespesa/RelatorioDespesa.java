import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RelatorioDespesa {
    
    public void imprimirRelatorio(List<DespesaBase> despesas) {
        System.out.print(gerarRelatorio(despesas));
    }

    private String gerarRelatorio(List<DespesaBase> despesas) {
        return cabecalho() + corpo(despesas) + resumo(despesas);
    }

    private String cabecalho() {
        return "\n\n---------------------Relatório de Despesas---------------------\n\n";
    }

    private String corpo(List<DespesaBase> despesas) {
        return despesas.stream()
                .map(DespesaBase::toString)  
                .collect(Collectors.joining("\n")) + "\n";
    }

    private String resumo(List<DespesaBase> despesas) {
        return "\nTotal de refeições: " + somarDespesas(despesas, DespesaBase::ehComida) + "\n" +
               "Total geral: " + somarDespesas(despesas, d -> true) + "\n";
    }

    private int somarDespesas(List<DespesaBase> despesas, Predicate<DespesaBase> filtro) {
        return despesas.stream()
                .filter(filtro)
                .mapToInt(DespesaBase::getValor)  
                .sum();
    }
}
