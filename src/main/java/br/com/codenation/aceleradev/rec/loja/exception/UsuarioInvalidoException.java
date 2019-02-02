package br.com.codenation.aceleradev.rec.loja.exception;

public class UsuarioInvalidoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UsuarioInvalidoException(String message) {
        super(message);
    }

    public UsuarioInvalidoException() {
        super();
    }

    public UsuarioInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsuarioInvalidoException(Throwable cause) {
        super(cause);
    }

}
