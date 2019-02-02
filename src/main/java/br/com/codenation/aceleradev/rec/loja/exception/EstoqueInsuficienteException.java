package br.com.codenation.aceleradev.rec.loja.exception;

public class EstoqueInsuficienteException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EstoqueInsuficienteException(String message) {
        super(message);
    }

    public EstoqueInsuficienteException() {
        super();
    }

    public EstoqueInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }

    public EstoqueInsuficienteException(Throwable cause) {
        super(cause);
    }

}
