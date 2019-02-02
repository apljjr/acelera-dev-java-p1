package br.com.codenation.aceleradev.rec.loja.entidades;

public enum ECategoria {
    SHOWS(0),
    FILMES(1),
    SOFTWARES(2);

    private int valor;
    ECategoria(int valorOpcao){
        valor = valorOpcao;
    }


    public int getValor(){
        return valor;
    }

}
