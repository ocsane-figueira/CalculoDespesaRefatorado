public class Despesa {
    private final TipoDespesa tipo;
    private final int valor;

    public Despesa(TipoDespesa tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public TipoDespesa getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public boolean ehComida() {
        return tipo.ehComida();
    }

    public boolean ehAcimaDoLimite() {
        return valor > tipo.getLimite();
    }
}
