
import static java.lang.Integer.MAX_VALUE;

public enum TipoDespesa {  

    JANTAR("Jantar", 5000, true),
    CAFE_DA_MANHA("Café da Manhã", 1000, true),
    ALMOCO("Almoço", 2000, true),
    //MAX_VALUE está atribuido ao Integer, ou seja, é o tamanho maximo que for atribuido nesse caso. Nao ha tratativa para ele pois nao ehComida
    ALUGUEL_CARRO("Aluguel de Carro", MAX_VALUE, false);

    private final String nome;
    private final int limite;
    private final boolean ehComida;

    TipoDespesa(final String nome, final int limite, final boolean ehComida) {
        this.nome = nome;
        this.limite = limite;
        this.ehComida = ehComida;
    }

    public String getNome() {
        return nome;
    }

    public boolean ehComida() {
        return ehComida;
    }

    public int getLimite() {
        return limite;
    }
}



