package br.com.codenation.aceleradev.rec.loja.entidades;

import java.math.BigDecimal;

public abstract class Produto {

  private long id;
  private String descricao;
  private BigDecimal preco;
  private int qtdEstoque;
  private int categoria;

  @Override
  public String toString() {
    return String.format("%d - %s", id, descricao);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public BigDecimal getPreco() {
    return preco;
  }

  public void setPreco(BigDecimal preco) {
    this.preco = preco;
  }

  public int getQtdEstoque() {
    return qtdEstoque;
  }

  public void setQtdEstoque(int qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
  }

  public int getCategoria() {
    return categoria;
  }

  public void setCategoria(int categoria) {
    this.categoria = categoria;
  }
}
