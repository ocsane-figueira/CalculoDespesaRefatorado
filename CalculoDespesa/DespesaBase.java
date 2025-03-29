public abstract class DespesaBase {
    protected final TipoDespesa tipo;
    protected final int valor;

    public DespesaBase(TipoDespesa tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }


    public TipoDespesa getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public abstract boolean ehComida();

    public boolean ehAcimaDoLimite() {
        return valor > tipo.getLimite();
    }

    @Override
    public String toString() {
        return tipo.getNome() + " " + valor + " " + (ehAcimaDoLimite() ? "Limite Excedido" : " ");
    }
}
