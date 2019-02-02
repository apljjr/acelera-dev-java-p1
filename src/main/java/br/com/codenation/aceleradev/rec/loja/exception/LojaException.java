package br.com.codenation.aceleradev.rec.loja.exception;

public class LojaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LojaException(String message) {
        super(message);
    }

    public LojaException() {
        super();
    }

    public LojaException(String message, Throwable cause) {
        super(message, cause);
    }

    public LojaException(Throwable cause) {
        super(cause);
    }

}
