// Classe principal que representa um pagamento
public abstract class MetodoPagamento {
    private double valor;
    
    public MetodoPagamento(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
    
    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void processarPagamento();
    
    // Método abstrato para gerar recibo
    public abstract void emitirRecibo();
}

// Interface para pagamentos que requerem autenticação
public interface Autenticavel {
    boolean autenticar();
}

// Exceção personalizada para pagamentos
public class PagamentoException extends Exception {
    public PagamentoException(String mensagem) {
        super(mensagem);
    }
}
