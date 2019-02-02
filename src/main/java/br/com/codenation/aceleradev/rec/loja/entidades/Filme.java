package br.com.codenation.aceleradev.rec.loja.entidades;

public class Filme  extends Produto {

  private String diretor;
  private int anoLacamento;

  public String getDiretor() {
    return diretor;
  }

  public void setDiretor(String diretor) {
    this.diretor = diretor;
  }

  public int getAnoLacamento() {
    return anoLacamento;
  }

  public void setAnoLacamento(int anoLacamento) {
    this.anoLacamento = anoLacamento;
  }
}
