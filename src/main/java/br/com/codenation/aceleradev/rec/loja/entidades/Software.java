package br.com.codenation.aceleradev.rec.loja.entidades;

public class Software extends Produto {

  private String versao;
  private String requisitoSistema;

  @Override
  public String toString() {
    return super.toString();
  }

  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public String getRequisitoSistema() {
    return requisitoSistema;
  }

  public void setRequisitoSistema(String requisitoSistema) {
    this.requisitoSistema = requisitoSistema;
  }
}
