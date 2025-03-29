public class Despesa extends DespesaBase {
    public Despesa(TipoDespesa tipo, int valor) {
        super(tipo, valor);
    }

    @Override
    public boolean ehComida() {
        return false;
    }
}
