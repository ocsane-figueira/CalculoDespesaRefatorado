public class DespesaAlimenticia extends DespesaBase {
    public DespesaAlimenticia(TipoDespesa tipo, int valor) {
        super(tipo, valor);
    }

    @Override
    public boolean ehComida() {
        return true;
    }
}
